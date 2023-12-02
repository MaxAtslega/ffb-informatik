package de.atslega.arztpraxis.stack;

public class ListElementStack<T> {
    private T content;

    private ListElementStack<T> next;

    private ListElementStack<T> before;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public ListElementStack<T> getNext() {
        return next;
    }

    public void setNext(ListElementStack<T> next) {
        this.next = next;
    }

    public ListElementStack<T> getBefore() {
        return before;
    }

    public void setBefore(ListElementStack<T> before) {
        this.before = before;
    }

    public ListElementStack(T content, ListElementStack<T> next, ListElementStack<T> before) {
        this.content = content;
        this.next = next;
        this.before = before;
    }

}
