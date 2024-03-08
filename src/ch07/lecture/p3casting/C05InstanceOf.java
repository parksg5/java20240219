package ch07.lecture.p3casting;

public class C05InstanceOf {
    public static void main(String[] args) {
        B b = new E();

        System.out.println(b instanceof E);
        System.out.println(b instanceof B);
    }
}

// @formatter:off
class A {}
class B extends A {}
class D extends B {}
class E extends B {}
class C extends A {}
class F extends C {}