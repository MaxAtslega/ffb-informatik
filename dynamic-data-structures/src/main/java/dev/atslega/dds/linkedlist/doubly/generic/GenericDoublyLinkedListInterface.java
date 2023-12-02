package dev.atslega.dds.linkedlist.doubly.generic;

public interface GenericDoublyLinkedListInterface<T> {
    boolean isEmpty();

    boolean hasAccess();

    void back();

    void next();

    void toFirst();

    void toLast();

    T getObject();

    void setObject(T pObject);

    void append(T pObject);

    void insert(T pObject);

    void concat(GenericDoublyLinkedList<T> pList);

    void remove();
}
