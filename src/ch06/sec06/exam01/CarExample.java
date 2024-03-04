package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();

        // Car 객체의 필드값 읽기
        // 필드에 값을 넣지 않으면
        // 0, false, null
        // 책 214쪽 표

        System.out.println("모델명 = " + myCar.model);
        System.out.println("시동여부 = " + myCar.start);
        System.out.println("현재속도 = " + myCar.speed);
    }
}
