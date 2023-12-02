package dev.atslega.dds.linkedlist.single.nongeneric;

public class SinglyLinkedList implements SinglyLinkedListInterface {
    private SingleNode anchor = null;

    private SingleNode current = null;

    @Override
    public boolean isEmpty() {
        return anchor == null;
    }

    @Override
    public boolean hasAccess() {
        return current != null;
    }

    @Override
    public void back() {
        if (hasAccess()) {
            SingleNode temp = anchor;
            while (temp.getNext() != current) {
                temp = temp.getNext();
            }
            current = temp;
        }
    }

    @Override
    public void next() {
        if (hasAccess()) {
            current = current.getNext();
        }
    }

    @Override
    public void toFirst() {
        if (!isEmpty()) {
            current = anchor;
        }
    }

    @Override
    public void toLast() {
        if (!isEmpty()) {
            current = anchor;
            while (current.getNext() != null) {
                current = current.getNext();
            }
        }
    }

    @Override
    public Object getObject() {
        if (hasAccess()) {
            return current.getContent();
        } else {
            return null;
        }
    }

    @Override
    public void setObject(Object pObject) {
        if (hasAccess()) {
            current.setContent(pObject);
        }
    }

    @Override
    public void append(Object pObject) {
        if (isEmpty()) {
            anchor = new SingleNode(pObject, null);
            current = anchor;
        } else {
            SingleNode temp = anchor;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new SingleNode(pObject, null));
        }
    }

    @Override
    public void insert(Object pObject) {
        if (isEmpty() || !hasAccess()) {
            append(pObject);
        } else {
            if (current == anchor) {
                anchor = new SingleNode(pObject, anchor);
            } else {
                SingleNode newNode = new SingleNode(pObject, current.getNext());
                current.setNext(newNode);
            }
        }
    }

    @Override
    public void concat(SinglyLinkedList pList) {
        if (pList != null && !pList.isEmpty()) {
            if (!isEmpty()) {
                current = anchor;
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(pList.anchor);
            } else {
                anchor = pList.anchor;
            }
            pList.anchor = null;
        }
    }

    @Override
    public void remove() {
        if (hasAccess()) {
            if (current == anchor) {
                anchor = anchor.getNext();
            } else {
                back();
                current.setNext(current.getNext().getNext());
            }
        }
    }
}
