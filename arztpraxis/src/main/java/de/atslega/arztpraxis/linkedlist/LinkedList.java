package de.atslega.arztpraxis.linkedlist;

import javax.lang.model.element.Element;

public class LinkedList {
    private ListNode anchor = null;
    private ListNode current = null;

    public LinkedList() {

    }

    public boolean isEmpty() {
        return anchor == null;
    }

    public boolean hasAccess() {
        return current != null;
    }

    public void next() {
        if (hasAccess()) {
            current = current.getNext();
        }
    }

    public void toFirst() {
        current = anchor;
    }

    public void toLast() {
        if (hasAccess()) {
            while (current.getNext() != null) {
                next();
            }
        }
    }

    public void append(Element element) {
        ListNode newElement = new ListNode(element, null, null);

        if (isEmpty()) {
            current = newElement;
            anchor = newElement;
        } else {
            toLast();
            newElement.setPrevious(current);
            current.setNext(newElement);
            current = newElement;
        }
    }

    public void insert(Element element) {
        if (hasAccess()) {
            ListNode newElement = new ListNode(element, current.getPrevious(), current);

            if (current.getPrevious() != null) {
                current.setNext(newElement);
            } else {
                current.setPrevious(newElement);
                anchor = newElement;
            }

            current = newElement;
        }
    }

    public void remove() {
        if (hasAccess()) {
            ListNode previousElement = current.getPrevious();
            ListNode nextElement = current.getNext();

            if (previousElement == null) {
                anchor = nextElement;
            } else {
                previousElement.setNext(nextElement);
            }


            if (nextElement == null) {
                current = previousElement;
            } else {
                nextElement.setPrevious(previousElement);
                current = nextElement;
            }
        }
    }
}
