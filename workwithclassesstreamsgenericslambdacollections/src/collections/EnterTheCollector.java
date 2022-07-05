package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class EnterTheCollector {

    public static void main(String[] args){
        Product door = new Product(1, "Wooden Door", 35);
        Product floorPanel = new Product(2, "Floor Panel", 25);
        Product window = new Product(3, "Glass Window" , 10);

        List<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        products.add(floorPanel);
        products.add(window);
        products.add(floorPanel);

/*
        products
                .stream()
                .filter(prod -> prod.getWeight() < 30)
                .sorted(Comparator.comparingInt(Product::getWeight))
                .forEach(System.out::println);
*/
/*

        List<Product>  lightProducts =
        products
                .stream()
                .filter(prod -> prod.getWeight() < 30)
                .sorted(Comparator.comparingInt(Product::getWeight))
                .collect(Collectors.toList());
*/

/*        Map<String, List <Product>> lightProducts =
                products
                        .stream()
                        .filter(prod -> prod.getWeight() < 30)
                        .sorted(Comparator.comparingInt(Product::getWeight))
                        .collect(groupingBy(Product::getName));*/

        Map<String, Long> lightProducts =
                products
                        .stream()
                        .filter(prod -> prod.getWeight() < 30)
                        .sorted(Comparator.comparingInt(Product::getWeight))
                        .collect(groupingBy(Product::getName, counting()));

        System.out.println("\n" + lightProducts);

    }
}
