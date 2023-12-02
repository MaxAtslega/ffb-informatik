package dev.atslega.dds.queue.generic;

public class GenericNode<T> {

    private T content = null;
    private boolean priority;

    private GenericNode<T> previous = null;
    private GenericNode<T> next = null;

    public GenericNode(T content, GenericNode<T> previous, GenericNode<T> next) {
        this.content = content;
        this.previous = previous;
        this.next = next;
        this.priority = false;
    }

    public GenericNode(T content, GenericNode<T> previous, GenericNode<T> next, boolean priority) {
        this.content = content;
        this.previous = previous;
        this.next = next;
        this.priority = priority;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
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
