package collections;

import java.util.*;

public class Main {

    public static void main (String [] args){


        ArrayList list = new ArrayList();

        list.add("foo");
        list.add("Bar");
        list.add(3);

        System.out.println("Elements:  " +  list.size());
        String s = (String) list.get(0);

        Employee e = new Employee(1,"Jean");
        e.setEmpID(1);
        e.setEmpName("Marie");

        list.add(e);

        for(Object o : list)
            System.out.println(o.toString());

        list.remove("Bar");
      //  list.replaceAll();
        for(Object o : list)
            System.out.println(o.toString());

        //forEach
        ArrayList <Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee(1, "Marie"));
        listEmp.add(new Employee(2, "Irish"));
        listEmp.add(new Employee(1, "Arielle"));

        listEmp.forEach(m -> System.out.println(m.getEmpName()));

        //removeIf
        listEmp.removeIf(m -> m.getEmpName().equals("Marie"));
        listEmp.forEach(m -> System.out.println(m.getEmpName()));

        Object[] objArray = listEmp.toArray();
    //    Employee[] a1 = list.toArray(new Employee[0]);


        Employee[] a2 = {
                new Employee(1, "Marie"),
                new Employee(2, "Arielle"),
                new Employee(3, "Airish")
        };

        Arrays.asList(a2);

        Collection<Employee> list1 = Arrays.asList(a2);
        list1.forEach(c -> System.out.println(c.getEmpName()));

        //Collection types
        //MAP

        Map<String, String> map = new HashMap<>();

        map.put("2222", "ghi");
        map.put("3333", "abc");
        map.put("1111", "def");
        String s1 = map.get("3333"); //abc
        String s2 = map.get("9999"); //null
        String s3 = map.getOrDefault("9999","xyz"); //xyz

        map.forEach( (k,v) -> System.out.println(k + "|" + v));
        map.replaceAll((k,v) -> v.toUpperCase());
        map.forEach( (k,v) -> System.out.println(k + "|" + v));


    }
}
