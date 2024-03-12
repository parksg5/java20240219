package ch09.lecture.p1nested;

public class C06NestedInterface {

}

class C06OtherClass implements C06MyClass.C06NestedInterface {

}

class C06MyClass {
    // 중첩클래스, 인터페이스
    interface C06NestedInterface {

    }

    // 필드,생성자,메소드
    void method1() {
        class LocalClass implements C06NestedInterface {

        }
    }
}