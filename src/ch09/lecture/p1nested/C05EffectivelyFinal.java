package ch09.lecture.p1nested;

public class C05EffectivelyFinal {
    void emthod(int param) { // 파라미터도 final or effectively final
//        param = 3;
        int i = 3; // final or effectively final
        class LocalClass {
            void method() {
                System.out.println(i);
                System.out.println(param);
            }
        }
    }
}
