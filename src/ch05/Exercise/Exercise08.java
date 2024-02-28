package ch05.Exercise;

public class Exercise08 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int total1Sum = 0;
        for (int i = 0; i < array[0].length; i++) {
            total1Sum += array[0][i];
        }
        System.out.println("첫번째그룹 총 점수 = " + total1Sum);
        double total1Avg = (double) total1Sum / array[0].length;
        System.out.println("첫번째그룹 평균 점수 = " + total1Avg);

        int total2Sum = 0;
        for (int i = 0; i < array[1].length; i++) {
            total2Sum += array[1][i];
        }
        System.out.println("두번째그룹 총 점수 = " + total2Sum);
        double total2Avg = (double) total2Sum / array[1].length;
        System.out.println("두번째그룹 평균 점수 = " + total2Avg);

        int total3Sum = 0;
        for (int i = 0; i < array[2].length; i++) {
            total3Sum += array[2][i];
        }
        System.out.println("세번째그룹 총 점수 = " + total3Sum);
        double total3Avg = (double) total3Sum / array[2].length;
        System.out.println("세번째그룹 평균 점수 = " + total3Avg);
        
        int totalSum = 0;
        int totalStudent = 0;
        for (int i = 0; i < array.length; i++) {
            totalStudent += array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                totalSum += array[i][j];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("총 평균 점수 = " + totalAvg);

    }
}
