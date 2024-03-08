package ch07.Exercise.p6;

public class Child extends Parent {
    public String studentNo;

    public Child(String name, String studentNo) {
//        this.name = name;
        super(name);
        this.studentNo = studentNo;
    }
}
