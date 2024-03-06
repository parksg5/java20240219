package ch06.exercise.p20;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("-----------------------------------------");
            System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금 |5.종료");
            System.out.println("-----------------------------------------");
            System.out.println("선택> ");

            String menu = scanner.nextLine();

            switch (menu) {
                case "1" -> {
                    scanner.nextLine();
                    System.out.println("---------");
                    System.out.println("계좌생성");
                    System.out.println("---------");
                    System.out.println("계좌번호: ");
                    System.out.println("계좌주: ");
                    System.out.println("초기입금액: ");
                    scanner.nextLine();
                    System.out.println("결과: 계좌가 생성되었습니다.");
                }
            }
        }

    }
}
