package collections;

import java.util.ArrayList;
import java.util.List;

public class Supplier1 {

    private final String name;
    private final List<Product> products = new ArrayList<>();

    public List<Product> getProducts(){
        return products;
    }
    public Supplier1(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "Supplier name='" + name + "\'" + ", products="+products +"}";
    }

}
