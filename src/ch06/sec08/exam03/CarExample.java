package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car myCar = new Car();

        // 리턴값이 없는 setGas() 메소드 호출
        myCar.setGas(5);

        // isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 블록 실행
        if (myCar.isLeftGas()) {
            System.out.println("출발합니다");

            //리턴값이 없는 run() 메소드 호출
            myCar.run();
        }
        System.out.println("gas를 주입하세요.");
    }
}

class Car {
    // 필드 선언
    int gas;

    // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
    void setGas(int gas) {
        this.gas = gas;
    }

    // 리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false; // false를 리턴하고 메소드 종료
        }
        System.out.println("gas가 있습니다.");
        return true; // ture를 리턴하고 메소드 종료
    }

    // 리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드를 종료
    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas잔량 = " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas잔량 = " + gas + ")");
                return; // 메소드 종료
            }
        }
    }
}

