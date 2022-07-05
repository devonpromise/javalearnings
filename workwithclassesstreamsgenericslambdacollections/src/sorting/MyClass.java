package sorting;

public class MyClass implements Comparable<MyClass> {
    String label, value;


    public MyClass(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public  String toString(){
        return label + " | " + value;
    }

    @Override
    public boolean equals(Object obj) {
        MyClass other = (MyClass) obj;
        return value.equalsIgnoreCase(other.value);
    }

    @Override
    public int compareTo(MyClass o) {
        return value.compareToIgnoreCase(o.value);
    }

    public String getLabel() {
        return label;
    }
}
