package dev.atslega.dds.linkedlist.single.nongeneric;

public class SingleNode {

    private Object content = null;

    private SingleNode next = null;

    public SingleNode(Object content, SingleNode next) {
        this.content = content;
        this.next = next;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }
}
