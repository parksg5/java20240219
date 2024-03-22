package ch13.exercise.p2;

public class Container<T> {
    private T item;

    public T get() {
        return item;
    }

    public void set(T param) {
        item = param;
    }
}
