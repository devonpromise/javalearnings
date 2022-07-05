package sorting;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main (String[] args){
        TreeSet<MyClass> tree = new TreeSet<>(new MyComparator());
        tree.add(new MyClass("2222", "ghi"));
        tree.add(new MyClass("3333", "abc"));
        tree.add(new MyClass("1111", "def"));

        tree.forEach(m -> System.out.println(m));

        System.out.println("----SortedMap---");

        SortedMap<String, String> map = new TreeMap<>();
        map.put("2222", "ghi");
        map.put("3333", "abc");
        map.put("1111", "def");
        map.put("6666", "xyz");
        map.put("4444", "mno");
        map.put("5555", "pqr");

        map.forEach((k,v) -> System.out.println(k + " | " + v));

        System.out.println("---HeadMap----");

        //headmap
        SortedMap<String, String> hMap = map.headMap("3333");
        hMap.forEach((k,v) -> System.out.println(k + " | " + v));
        System.out.println("----TailMap---");

        //tailmap
        SortedMap<String, String> tMap = map.tailMap("3333");
        tMap.forEach((k,v) -> System.out.println(k + " | " + v));

    }
}
