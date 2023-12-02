package dev.atslega.dds.queue.nongeneric;

public class Node {
    private Object content = null;
    private boolean priority;

    private Node previous = null;
    private Node next = null;

    public Node(Object content, Node previous, Node next) {
        this.content = content;
        this.previous = previous;
        this.next = next;
    }

    public Node(Object content, Node previous, Node next, boolean priority) {
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

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
