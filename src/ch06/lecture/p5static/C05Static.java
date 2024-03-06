package ch06.lecture.p5static;

public class C05Static {
    // 인스턴스 필드

    // static 필드 ( class 변수)
    static int age = 30;
    static double area = Math.PI * 10 * 10;

    // static block
    // static 멤버 초기 설정용
    static {
        System.out.println("statement...");
        System.out.println("statement...");
        System.out.println("statement...");
        System.out.println("statement...");
        method1();
        area = Math.PI * 10 * 10;
    }

    // 생성자

    // 인스턴스 메소드

    // static 메소드
    static void method1() {
    }
}
