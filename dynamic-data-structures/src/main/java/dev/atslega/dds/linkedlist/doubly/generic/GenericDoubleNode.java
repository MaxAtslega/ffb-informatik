package dev.atslega.dds.linkedlist.doubly.generic;

public class GenericDoubleNode<T> {

    private T content = null;

    private GenericDoubleNode<T> previous = null;
    private GenericDoubleNode<T> next = null;

    public GenericDoubleNode(T content, GenericDoubleNode<T> previous, GenericDoubleNode<T> next) {
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

    public GenericDoubleNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(GenericDoubleNode<T> previous) {
        this.previous = previous;
    }

    public GenericDoubleNode<T> getNext() {
        return next;
    }

    public void setNext(GenericDoubleNode<T> next) {
        this.next = next;
    }
}
