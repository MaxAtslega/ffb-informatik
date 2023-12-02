package dev.atslega.dds.linkedlist.doubly.nongeneric;

public class DoubleNode {

    private Object content = null;

    private DoubleNode previous = null;
    private DoubleNode next = null;

    public DoubleNode(Object content, DoubleNode previous, DoubleNode next) {
        this.content = content;
        this.previous = previous;
        this.next = next;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }
}
