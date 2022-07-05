package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {

    public static void main (String[] args){
        Product door = new Product(1, "Wooden Door", 35);
        Product floorPanel = new Product(2, "Floor Panel", 25);
        Product window = new Product(3, "Glass Windows", 10);


        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        System.out.println(products);

        //Use Iterator to add or remove an element in the list

        Iterator<Product> iterator  = products.iterator();
        while (iterator.hasNext()){

            Product product = iterator.next();
            if(product.getWeight() >  20){
                iterator.remove();
            }

        }

        System.out.println(products);

        //You cannot add or remove product while in a loop
        for (Product p:products
              ) {
            System.out.println(p);

        }
    }
}
