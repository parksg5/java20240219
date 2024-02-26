package ch04.lecture.p4for;

public class C05ForExercise {
    public static void main(String[] args) {
        /*
         *****
         *****
         *****
         *****
         *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

         *
         **
         ***
         ****
         *****

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

         *****
         ****
         ***
         **
         *

         */
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

        *****
        ****#
        ***##
        **###
        *####
        #####

         */
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("#");
            }
            System.out.println();
        }

         /*

        0
        01
        012
        0123
        01234

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*

        1
        12
        123
        1234
        12345

         */
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*

        0
        12
        345
        6789
        01234

         */
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++, k++) {
                System.out.print(k % 10);
            }
            System.out.println();
        }

        /*

        1
        23
        456
        7890
        12345

         */
        k = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++, k++) {
                System.out.print(k % 10);
            }
            System.out.println();
        }
    }
}