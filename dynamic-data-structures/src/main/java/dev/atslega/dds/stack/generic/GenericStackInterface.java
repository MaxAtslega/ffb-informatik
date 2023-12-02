package dev.atslega.dds.stack.generic;

public interface GenericStackInterface<T> {

    void push(T element);

    T pop();

    T peek();

    boolean isEmpty();

    int size();

    void clear();

    void print();
}
