package dev.atslega.dds.linkedlist.single.nongeneric;

public interface SinglyLinkedListInterface {

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

    void concat(SinglyLinkedList pList);

    void remove();

}
