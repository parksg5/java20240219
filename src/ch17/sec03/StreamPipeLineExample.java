package ch17.sec03;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );
        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.println("avg = " + avg);

        // 고전적 방법
        double sum = 0;
        for (Student student : list) {
            sum += student.getScore();
        }
        double avg1 = sum / list.size();
        System.out.println("avg1 = " + avg1);
    }
}
