package ch07.Exercise.p4;

public class Exercise04 {
    public static void main(String[] args) {
        Parent p = new Child();
//        p.method2();
    }
}

class Parent {
    public void method1(int a) {

    }
}

class Child extends Parent {
    @Override // 컴파일러가 컴파일시 이 메소드가 재정의 한 것이지 체크 함
    public void method1(int a) {

    }


    public void method2() {

    }
}