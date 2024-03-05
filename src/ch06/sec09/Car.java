package ch06.sec09;

public class Car {
    // 필드 선언
    String model;
    int speed;

    Car(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        this.setSpeed(100);
        System.out.println(this.model + "가 달랍니다.(시속:" + this.speed + "km/h)");
    }
}
