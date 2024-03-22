package ch13.exercise.p2;

import ch08.Exercise.p8.C;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.set("홍길동");
        String str = container1.get();

        Container<Integer> container2 = new Container<>();
        container2.set(6);
        int Value = container2.get();
    }
}
