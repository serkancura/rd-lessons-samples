package org.rd.lessons.lesson14.genericType;

public class Box<T> {
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
