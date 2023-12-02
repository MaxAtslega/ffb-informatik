package dev.atslega.dds.queue.generic;

public interface GenericQueueInterface<T> {

    void enqueue(T element, boolean priority);

    T dequeue();

    T peek();

    boolean isEmpty();

    int size();

    void clear();

    void print();

}
