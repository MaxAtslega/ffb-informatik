package de.atslega.arztpraxis.queue;

public class ListElement<T extends Prioritizable> {
    private T content;

    private ListElement next;

    private ListElement before;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public ListElement<T> getNext() {
        return next;
    }

    public void setNext(ListElement<T> next) {
        this.next = next;
    }

    public ListElement<T> getBefore() {
        return before;
    }

    public void setBefore(ListElement<T> before) {
        this.before = before;
    }

    public ListElement(T content, ListElement<T> next, ListElement<T> before) {
        this.content = content;
        this.next = next;
        this.before = before;
    }
}
