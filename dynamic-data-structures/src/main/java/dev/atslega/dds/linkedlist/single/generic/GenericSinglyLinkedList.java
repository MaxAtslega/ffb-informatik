package dev.atslega.dds.linkedlist.single.generic;



public class GenericSinglyLinkedList<T> implements GenericSinglyLinkedListInterface<T> {

    private GenericSingleNode<T> anchor = null;

    private GenericSingleNode<T> current = null;

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
            GenericSingleNode<T> temp = anchor;
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
    public T getObject() {
        if (hasAccess()) {
            return current.getContent();
        } else {
            return null;
        }
    }

    @Override
    public void setObject(T pObject) {
        if (hasAccess()) {
            current.setContent(pObject);
        }
    }

    @Override
    public void append(T pObject) {
        if (isEmpty()) {
            anchor = new GenericSingleNode<>(pObject, null);
            current = anchor;
        } else {
            GenericSingleNode<T> temp = anchor;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new GenericSingleNode<>(pObject, null));
        }
    }

    @Override
    public void insert(T pObject) {
        if (isEmpty() || !hasAccess()) {
            append(pObject);
        } else {
            if (current == anchor) {
                anchor = new GenericSingleNode<>(pObject, anchor);
            } else {
                GenericSingleNode<T> newNode = new GenericSingleNode<>(pObject, current.getNext());
                current.setNext(newNode);
            }
        }
    }

    @Override
    public void concat(GenericSinglyLinkedList<T> pList) {
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
