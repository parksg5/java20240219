package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        myCal.powerOn();

        int result1 = myCal.plus(5, 6);
        System.out.println("result1 = " + result1);
        int x = 10;
        int y = 4;
        //divide() 메소드 호출 시 변수 x와 y의 값을 매개값으로 제공하고,
        //나눗셈 결과를 리턴 받아 result2 변수에 대입
        double result2 = myCal.divide(x, y);
        System.out.println("result2 = " + result2);
        //리턴값이 없는 powerOff() 메소드 호출
        myCal.powerOff();
    }
}
