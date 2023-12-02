package dev.atslega.dds.queue.nongeneric;

public class Queue implements QueueInterface {

    private Node head = null;
    private Node tail = null;

    private int size = 0;

    @Override
    public void enqueue(Object element, boolean priority) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }

        Node newNode = new Node(element, null, null, priority);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            if (priority) {
                Node current = head;

                while (current != null && current.getContent() != null && current.isPriority()) {
                    current = current.getNext();
                }

                if (current == null) {
                    tail.setNext(newNode);
                    newNode.setPrevious(tail);
                    tail = newNode;
                } else {
                    newNode.setNext(current);
                    newNode.setPrevious(current.getPrevious());
                    if (current.getPrevious() != null) {
                        current.getPrevious().setNext(newNode);
                    } else {
                        head = newNode;
                    }
                    current.setPrevious(newNode);
                }

            } else {
                tail.setNext(newNode);
                newNode.setPrevious(tail);
                tail = newNode;
            }
        }
        size++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        Object result = head.getContent();
        head = head.getNext();
        if (head != null) {
            head.setPrevious(null);
        } else {
            tail = null;
        }
        size--;
        return result;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return head.getContent();
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    @Override
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getContent());
            current = current.getNext();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: [");
        Node current = head;
        while (current != null) {
            sb.append(current.getContent());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
