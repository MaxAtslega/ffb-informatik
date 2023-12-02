package dev.atslega.dds.stack.nongeneric;

public class Stack implements StackInterface {

    private Node top = null;
    private int size = 0;


    @Override
    public void push(Object element) {
        Node newNode = new Node(element, null, top);
        if (top != null) {
            top.setPrevious(newNode);
        }
        top = newNode;
        size++;
    }

    @Override
    public Object pop() {
        if (top == null) {
            return null;
        }
        Object result = top.getContent();
        top = top.getNext();
        if (top != null) {
            top.setPrevious(null);
        }
        size--;
        return result;
    }

    @Override
    public Object peek() {
        if (top == null) {
            return null;
        }
        return top.getContent();
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        top = null;
        size = 0;
    }

    @Override
    public void print() {
        Node current = top;
        while (current != null) {
            System.out.println(current.getContent());
            current = current.getNext();
        }
    }
}
