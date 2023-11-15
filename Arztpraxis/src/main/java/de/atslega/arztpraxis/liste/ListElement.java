package de.atslega.arztpraxis.liste;

public class ListElement {
    private Object content;

    private ListElement next;

    private ListElement before;

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public ListElement getBefore() {
        return before;
    }

    public void setBefore(ListElement before) {
        this.before = before;
    }

    public ListElement(Object content, ListElement next, ListElement before) {
        this.content = content;
        this.next = next;
        this.before = before;
    }
}
