package ch12.sec06;

public class BoxingUnboxingExample {
    public static void main(String[] args) {
        Integer obj = 100; // auto boxing
        System.out.println("obj.intValue() = " + obj.intValue());
        //obj.intValue() : 수동 언박싱
        System.out.println("obj = " + obj); // 재정의한 toString 호출
        System.out.println("obj.toString() = " + obj.toString()); // 재정의 toString 호출

        int value = obj; // auto unboxing
        System.out.println("value = " + value);

        int result = obj + 100; // auto unboxing
        System.out.println("result = " + result);
    }
}
