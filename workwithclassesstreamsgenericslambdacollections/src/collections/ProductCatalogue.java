package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class ProductCatalogue implements Iterable<Product> {

    private final List<Product> products = new ArrayList<>();
    public void addSupplier(final Supplier1 supplier){

        List<Product> supplierProducts = supplier.getProducts();
        supplierProducts.forEach(product -> {

            if (!products.contains(product)){
                products.add(product);
            }
        });

    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
