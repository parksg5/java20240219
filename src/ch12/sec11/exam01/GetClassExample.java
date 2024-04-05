package ch12.sec11.exam01;

public class GetClassExample {
    public static void main(String[] args) throws Exception {
        // how1
        Class clazz = Car.class;

        // how2
        //Class clazz = Class.forName("ch12.sec11.exam01.Car");

        // how3
        //Class clazz = car.getClass();

        System.out.println("package = " + clazz.getName());
        System.out.println("simple = " + clazz.getName());
        System.out.println("name = " + clazz.getName());
    }
}
