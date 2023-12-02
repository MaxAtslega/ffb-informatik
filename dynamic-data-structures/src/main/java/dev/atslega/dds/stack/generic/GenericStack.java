package dev.atslega.dds.stack.generic;

public class GenericStack<T> implements GenericStackInterface<T> {

    private GenericNode<T> top = null;
    private int size = 0;

    @Override
    public void push(T element) {
        GenericNode<T> newNode = new GenericNode<>(element, null, top);
        if (top != null) {
            top.setPrevious(newNode);
        }
        top = newNode;
        size++;
    }

    @Override
    public T pop() {
        if (top == null) {
            return null;
        }
        T result = top.getContent();
        top = top.getNext();
        if (top != null) {
            top.setPrevious(null);
        }
        size--;
        return result;
    }

    @Override
    public T peek() {
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
        GenericNode<T> current = top;
        while (current != null) {
            System.out.println(current.getContent());
            current = current.getNext();
        }
    }
}
