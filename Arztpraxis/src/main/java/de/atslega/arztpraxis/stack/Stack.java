package de.atslega.arztpraxis.stack;

import de.atslega.arztpraxis.queue.ListElement;

public class Stack<T> implements StackInterface<T> {

    private ListElementStack<T> current;

    @Override
    public boolean isEmpty() {
        return current == null;
    }

    @Override
    public T top() {
        return current.getContent();
    }

    @Override
    public void push(T object) {
        if (object == null) {
            throw new IllegalArgumentException("Cannot enqueue null object");
        }

        ListElementStack<T> pObject = new ListElementStack<>(object, null, null);
        if (!isEmpty()){
            current.setNext(pObject);
            pObject.setBefore(current);
        }

        current = pObject;
    }

    @Override
    public void pop() {
        ListElementStack<T> before = current.getBefore();
        if (before == null){
         current = null;
         return;
        }

        before.setNext(null);
        current = before;
    }

    public String display() {
        StringBuilder result = new StringBuilder();
        ListElementStack<T> currentElement = current;

        while (currentElement != null) {
            result.append(currentElement.getContent().toString()).append(" ");
            currentElement = currentElement.getBefore();
        }

        return result.toString().trim();
    }
}
