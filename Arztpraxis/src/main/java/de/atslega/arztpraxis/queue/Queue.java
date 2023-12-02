package de.atslega.arztpraxis.queue;

import java.util.NoSuchElementException;

public class Queue<T extends Prioritizable> implements QueueInterface<T> {

    private ListElement<T> anchor;
    private ListElement<T> tail;

    @Override
    public boolean isEmpty() {
        return anchor == null;
    }

    @Override
    public void enqueue(T pObject) {
        if (pObject == null) {
            throw new IllegalArgumentException("Cannot enqueue null object");
        }

        ListElement<T> newElement = new ListElement<>(pObject, null, null);

        if (isEmpty()) {
            anchor = tail = newElement;
            return;
        }

        if (!pObject.isPriority()) {
            tail.setNext(newElement);
            newElement.setBefore(tail);
            tail = newElement;
            return;
        }

        if (!anchor.getContent().isPriority()) {
            newElement.setNext(anchor);
            anchor.setBefore(newElement);
            anchor = newElement;
        } else {
            ListElement<T> current = anchor;
            while (current.getNext() != null && current.getNext().getContent().isPriority()) {
                current = current.getNext();
            }

            newElement.setNext(current.getNext());
            newElement.setBefore(current);

            if (current.getNext() != null) {
                current.getNext().setBefore(newElement);
            }

            current.setNext(newElement);
            if (current == tail) {
                tail = newElement;
            }
        }

    }

    @Override
    public void dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        if (anchor == tail) {
            anchor = tail = null;
        } else {
            anchor = anchor.getNext();
            if (anchor != null) {
                anchor.setBefore(null);
            }
        }
    }

    @Override
    public T front() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return anchor.getContent();
    }

    public String display() {
        StringBuilder result = new StringBuilder();
        ListElement<T> currentElement = anchor;

        while (currentElement != null) {
            result.append(currentElement.getContent().toString()).append(" ");
            currentElement = currentElement.getNext();
        }

        return result.toString().trim();
    }
}
