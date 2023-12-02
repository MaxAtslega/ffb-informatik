package dev.atslega.dds.queue.nongeneric;

public interface QueueInterface {

    void enqueue(Object object, boolean priority);

    Object dequeue();

    Object peek();

    boolean isEmpty();

    int size();

    void clear();

    void print();
}
