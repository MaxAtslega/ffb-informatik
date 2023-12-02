package dev.atslega.dds.linkedlist.single.generic;

public interface GenericSinglyLinkedListInterface<T> {

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

    void concat(GenericSinglyLinkedList<T> pList);

    void remove();
}
