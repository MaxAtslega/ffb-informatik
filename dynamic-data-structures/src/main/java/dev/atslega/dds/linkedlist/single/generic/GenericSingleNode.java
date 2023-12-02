package dev.atslega.dds.linkedlist.single.generic;

public class GenericSingleNode<T> {

    private T content = null;

    private GenericSingleNode<T> next = null;

    public GenericSingleNode(T content, GenericSingleNode<T> next) {
        this.content = content;
        this.next = next;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T pContent) {
        content = pContent;
    }

    public GenericSingleNode<T> getNext() {
        return next;
    }

    public void setNext(GenericSingleNode<T> pNext) {
        next = pNext;
    }
}
