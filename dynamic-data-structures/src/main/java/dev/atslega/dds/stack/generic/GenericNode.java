package dev.atslega.dds.stack.generic;

public class GenericNode<T> {

    private T content = null;

    private GenericNode<T> previous = null;
    private GenericNode<T> next = null;

    public GenericNode(T content, GenericNode<T> previous, GenericNode<T> next) {
        this.content = content;
        this.previous = previous;
        this.next = next;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public GenericNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(GenericNode<T> previous) {
        this.previous = previous;
    }

    public GenericNode<T> getNext() {
        return next;
    }

    public void setNext(GenericNode<T> next) {
        this.next = next;
    }
}
