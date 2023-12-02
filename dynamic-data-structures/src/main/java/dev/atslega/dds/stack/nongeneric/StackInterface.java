package dev.atslega.dds.stack.nongeneric;

public interface StackInterface {

    void push(Object element);

    Object pop();

    Object peek();

    boolean isEmpty();

    int size();

    void clear();

    void print();
}
