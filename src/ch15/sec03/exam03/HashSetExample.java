package ch15.sec03.exam03;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("JSP")) {
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JDBC");

        for (String element : set) {
            System.out.println(element);
        }
    }
}