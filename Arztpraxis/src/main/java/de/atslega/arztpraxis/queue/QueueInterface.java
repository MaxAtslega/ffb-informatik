package de.atslega.arztpraxis.queue;

public interface QueueInterface<T extends Prioritizable> {

    boolean isEmpty();

    void enqueue(T pObject);

    void dequeue();

    Object front();
}
