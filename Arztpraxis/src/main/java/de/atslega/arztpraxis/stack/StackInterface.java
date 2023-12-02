package de.atslega.arztpraxis.stack;

public interface StackInterface<T> {

    boolean isEmpty();

    Object top();

    void push(T listElement);

    void pop();
}
