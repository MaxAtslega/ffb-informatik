package dev.atslega.dds.linkedlist.doubly.nongeneric;

public interface DoublyLinkedListInterface {

    boolean isEmpty();

    boolean hasAccess();

    void back();

    void next();

    void toFirst();

    void toLast();

    Object getObject();

    void setObject(Object pObject);

    void append(Object pObject);

    void insert(Object pObject);

    void concat(DoublyLinkedList pList);

    void remove();

}
