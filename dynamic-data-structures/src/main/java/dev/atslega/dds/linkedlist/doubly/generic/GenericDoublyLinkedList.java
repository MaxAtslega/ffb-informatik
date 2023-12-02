package dev.atslega.dds.linkedlist.doubly.generic;

public class GenericDoublyLinkedList<T> implements GenericDoublyLinkedListInterface<T> {

        private GenericDoubleNode<T> head = null;
        private GenericDoubleNode<T> tail = null;
        private GenericDoubleNode<T> current = null;

        @Override
        public boolean isEmpty() {
            return head == null;
        }

        @Override
        public boolean hasAccess() {
            return current != null;
        }

        @Override
        public void back() {
            if (hasAccess()) {
                current = current.getPrevious();
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
                current = head;
            }
        }

        @Override
        public void toLast() {
            if (!isEmpty()) {
                current = tail;
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
                head = new GenericDoubleNode<>(pObject, null, null);
                tail = head;
            } else {
                GenericDoubleNode<T> newNode = new GenericDoubleNode<>(pObject, tail, null);
                tail.setNext(newNode);
                tail = newNode;
            }
        }

        @Override
        public void insert(T pObject) {
            if (isEmpty() || !hasAccess()) {
                append(pObject);
            } else {
                if (current == head) {
                    GenericDoubleNode<T> newNode = new GenericDoubleNode<>(pObject, null, head);
                    head.setPrevious(newNode);
                    head = newNode;
                } else {
                    GenericDoubleNode<T> newNode = new GenericDoubleNode<>(pObject, current.getPrevious(), current);
                    current.getPrevious().setNext(newNode);
                    current.setPrevious(newNode);
                }
            }
        }

        @Override
        public void concat(GenericDoublyLinkedList<T> pList) {
            if (pList != null && !pList.isEmpty()) {
                if (isEmpty()) {
                    head = pList.head;
                    tail = pList.tail;
                } else {
                    tail.setNext(pList.head);
                    pList.head.setPrevious(tail);
                    tail = pList.tail;
                }
            }
        }

    @Override
    public void remove() {
        if (hasAccess()) {
            if (current == head) {
                head = head.getNext();
                if (head != null) {
                    head.setPrevious(null);
                }
            } else if (current == tail) {
                tail = tail.getPrevious();
                if (tail != null) {
                    tail.setNext(null);
                }
            } else {
                current.getPrevious().setNext(current.getNext());
                current.getNext().setPrevious(current.getPrevious());
            }
            current = null;
        }
    }
}
