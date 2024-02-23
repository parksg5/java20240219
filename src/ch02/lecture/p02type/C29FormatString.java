package ch02.lecture.p02type;

import java.util.FormatProcessor;

public class C29FormatString {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s%n", 1, name, job);

        System.out.println(STR."\{1} | \{name} | \{job}");

        //FMT Template Processor
        System.out.println(FormatProcessor.FMT."%6d\{1} | %-10s\{name} | %10s\{job}");
    }
// 75쪽 11문제
    /*public static void main1(String[] args) {
        int v1 = 1;
        System.out.println("v1: " + v1);
        if (true) {
            int v2 = 2;
            if (true) {
                int v3 = 2;
                System.out.println("v1 = " + v1);
                System.out.println("v2 = " + v2);
                System.out.println("v3 = " + v3);
            }
            System.out.println("v1 = " + v1);
            System.out.println("v2 = " + v2);
            System.out.println("v3 = " + v3);
        }
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
    }
    */
}
