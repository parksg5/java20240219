package ch05.Exercise;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int students = 3;
        int[] scores;

        while (run) {
            System.out.println("-------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------");
            System.out.print("선택> ");

            String menu = scanner.nextLine();

            if (menu.equals("1")) {
//                students++;
                System.out.println("1.학생수> " + students);
            } else if (menu.equals("2")) {

                System.out.println("scores");
            } else if (menu.equals("5")) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
        scanner.close();
    }
}
