package de.atslega.arztpraxis.linkedlist;

import de.atslega.arztpraxis.liste.List;

public class ListNode {

    private Object content = null;

    private ListNode previous = null;
    private ListNode next = null;

    public ListNode(Object content, ListNode previous, ListNode next){
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

    public ListNode getPrevious() {
        return previous;
    }

    public void setPrevious(ListNode previous) {
        this.previous = previous;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
