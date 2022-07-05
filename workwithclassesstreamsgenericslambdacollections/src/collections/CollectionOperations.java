package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionOperations {
    public static Product door = new Product(1, "Wooden Door", 35);
    public static Product floorPanel = new Product(2, "Floor Panel", 25);
    public static Product window = new Product(3, "Glass Window" , 10);


    public  static void main(String [] args){
        var products = new ArrayList<Product>();
        Collections.addAll(products, door, floorPanel, window);

        System.out.println(products);

        //var products = List.of(door, floorPanel, window);
        Product lightestProduct = Collections.min(products, Product.BY_WEIGHT);
        Product heaviestProduct = Collections.max(products, Product.BY_WEIGHT);

        System.out.println(lightestProduct);
        System.out.println(heaviestProduct);

    }


}
