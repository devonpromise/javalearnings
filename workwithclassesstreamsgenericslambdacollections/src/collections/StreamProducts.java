package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class StreamProducts {

    public static void main (String [] args){
        Product door = new Product(1, "Wooden Door", 35);
        Product floorPanel = new Product(2, "Floor Panel", 25);
        Product window = new Product(3, "Glass Window" , 10);

        List<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        products.add(floorPanel);
        products.add(window);

       // namesOfLightProductsWeightSortedLoop(products);

        //More efficient
        namesOfLightProductsWeightSortedStreams(products);
    }

    private static void namesOfLightProductsWeightSortedStreams(List<Product> products) {
        products
                .stream()
                .filter(product -> product.getWeight() < 30)
                .sorted(comparingInt(Product::getWeight))
                .map(Product::getName)
                .forEach(System.out::println);

        //filter -- remove elements from the stream that don't match a predicate
        //Map -- transform elements from one value into another

        products.stream().anyMatch(prod -> prod.getWeight() >20);

        products.stream().noneMatch(product -> product.getWeight() > 20); //returns boolean
        products.stream().allMatch(product -> product.getWeight() > 20);
        products
               .stream()
        // Discard next N elements
               .skip(1)
        // Only keep next N elements
               .limit(1);

        // SortComparable objects with default order
        products.stream().map(Product::getName).sorted();

        // Sort  objects with a specified comparator
        Comparator<Product> byName= Comparator.comparing(Product::getName);
        products.stream().sorted();

        //max  (or min) element given a sort order
        products.stream().max(Comparator.comparingInt(Product::getWeight));

        // Side effecting action fo reach element
        products.forEach(prod -> System.out.println(prod.getName()));

        //findFirst  (or findAny()) get the element
        products.stream().filter(product -> product.getName().contains("Chair")).findFirst();

        // Count number of elements in a stream
        products.stream().filter(prod -> prod.getName().contains("Chair")).count();

        //Combine elements together using a combining function
        //reduce()


    }

    private static void namesOfLightProductsWeightSortedLoop(List<Product> products) {

        List<Product> lightProducts = new ArrayList<>();
        for (Product product:  products
             ) {
            if (product.getWeight() < 30){
                lightProducts.add(product);
            }

        }


        lightProducts.sort(Product.BY_WEIGHT);

        //lightProducts.sort(comparingInt(Product::getWeight));

        for (Product product : lightProducts
             ) {
            System.out.println(product.getName());

        }
    }
}
