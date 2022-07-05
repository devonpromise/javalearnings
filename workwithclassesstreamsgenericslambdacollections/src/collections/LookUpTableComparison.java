package collections;

import java.util.*;

public class LookUpTableComparison {

    private static final int ITERATIONS = 5;
    private static final int NUMBER_OF_PRODUCTS = 20_000;

    private static final List<Product> products = generateProducts();


    public static void main(String[] args){
        runLookups(new MapProductLookupTable());
        runLookups(new NaiveProductLookupTable());

    }


    private static List<Product> generateProducts() {
        final List<Product> products = new ArrayList<>();
        final Random weightGenerator = new Random();
        for(int i = 0; i < NUMBER_OF_PRODUCTS; i++){
            products.add(new Product(i, "Product" + i, 10 + weightGenerator.nextInt()));
        }

        Collections.shuffle(products);
        Collections.shuffle(products);
        Collections.shuffle(products);
        return products;

    }
    private static void runLookups(final ProductLookupTable lookupTable) {
        final List<Product> products = LookUpTableComparison.products;
        System.out.println("Running lookups with " + lookupTable.getClass().getSimpleName());

        for (int i = 0; i < ITERATIONS; i++){
            final long startTime = System.currentTimeMillis();

            for (Product p: products){
                lookupTable.addProduct(p);
            }

            for(Product p: products){
                final Product result = lookupTable.lookupByid(p.getId());
                if(result != p){
                    throw new IllegalStateException("Lookup Table returned wrong result for "+ p);
                }
            }

            lookupTable.clear();

            System.out.println(System.currentTimeMillis() - startTime + "ms");

        }

    }

}
