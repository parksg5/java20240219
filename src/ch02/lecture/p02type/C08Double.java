package ch02.lecture.p02type;

public class C08Double {
    public static void main(String[] args) {
        // double
        // 실수 표현 타입
        // 8byte

        double a = 3.151592;
        double b = 2314513.912412;
        double c = -9312.912414456;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        double d = 23132131.12312512512412412;
        System.out.println("d = " + d);

        double e = 3.141592E2; // 314.1592
        System.out.println("e = " + e);

        // 0.03141592
        double f = 3.141592E-2; // 3.141592 * 10^2
        System.out.println("f = " + f);
    }
}
