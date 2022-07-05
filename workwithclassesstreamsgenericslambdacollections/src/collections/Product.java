package collections;

import java.util.Comparator;

public class Product  {

    private final int id;

    private final String name;
    private final int weight;

    public Product(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return String.format("Product {name= '%s', weight=%d}", name, weight);
    }

    //old approach
/*
    public static final Comparator<Product> BY_WEIGHT = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return Integer.compare(o1.getWeight(), o2.getWeight());
        }
    };*/
    //New approach
    public static final Comparator<Product> BY_WEIGHT =
            Comparator.comparingInt(Product::getWeight);

}
