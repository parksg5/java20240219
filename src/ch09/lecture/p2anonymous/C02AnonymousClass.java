package ch09.lecture.p2anonymous;

import ch08.Exercise.p8.C;

public class C02AnonymousClass {
    public static void main(String[] args) {
        C02Parent obj = new C02Parent() {
            // 상속된 멤버

            // 필요하면 재정의 가능
            void method1() {
                System.out.println("C02AnonymousClass.method1");
            }
        };
        obj.method1();
    }
}

abstract class C02Parent {
    void method1() {
        System.out.println("C02Parent.method1");
    }
}
