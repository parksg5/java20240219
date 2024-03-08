package ch07.lecture.p4abstract;

public class C01Abstract {
    public static void main(String[] args) {
        C01Anmal a1 = new C01Tiger();
        C01Anmal a2 = new C01Cat();

        // 추상 클래스로 인스턴스 생성 불가
//        C01Animal a3 = new C01Animal(); // x
    }
}

// @formatter:off
// 추상 클래스 (abstract class)
class C01Anmal {}
class C01Tiger extends C01Anmal {}
class C01Cat extends C01Anmal {}
