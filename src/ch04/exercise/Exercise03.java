package ch04.exercise;

public class Exercise03 {
    //    public static void main(String[] args) {
//        int sum = 0;
//
//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("3의 배수 합 = " + sum);
//    }
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 100; i += 3) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
