package collections;

import java.util.ArrayList;
import java.util.Collection;

public class TheArrayProblem {

    public static void main(String[] args){
        Product door = new Product(1, "Wooden Door", 35);
        Product floorPanel = new Product(2, "Floor Panel", 25);
        Product window = new Product(3, "Glass Windows", 10);

 /*       Product[] products = {door, floorPanel, window };

        //Print
        System.out.println(Arrays.toString(products));

        //Add
        products = add(window, products);
        System.out.println(Arrays.toString(products));*/

        Collection<Product> products = new ArrayList<>();

        System.out.println(products);


    }
/*
    private static Product[] add(Product product, Product[] products) {
        int length= products.length;
        Product[] newArray = Arrays.copyOf(products, length+1);
        newArray[length] = product;
        return newArray;
    }*/
}
