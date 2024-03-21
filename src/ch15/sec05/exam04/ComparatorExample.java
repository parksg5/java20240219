package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
//        var treeSet = new TreeSet<Fruit>(new FruitComparator());
        var treeset = new TreeSet<Fruit>((x, y) -> x.getPrice() - y.getPrice());
        treeset.add(new Fruit("포도", 3000));
        treeset.add(new Fruit("수박", 10000));
        treeset.add(new Fruit("딸기", 6000));
        System.out.println(treeset);
    }
}
