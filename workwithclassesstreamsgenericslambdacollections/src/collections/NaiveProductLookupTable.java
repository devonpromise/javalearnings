package collections;

import java.util.ArrayList;
import java.util.List;

public class NaiveProductLookupTable implements ProductLookupTable{

    private final List<Product> products = new ArrayList<>();


    @Override
    public Product lookupByid(int id) {

        for (Product p: products
             )
        {
            if  (p.getId() == id){
                return p;
            }

        }


        return null;
    }

    @Override
    public void addProduct(Product productToAdd) {

        for (Product p: products)
        {
            if  (p.getId() == productToAdd.getId()){
                throw new IllegalArgumentException("Unable  to add produce - duplicate id for "+  p);
            }

        }

        products.add(productToAdd);

    }

    @Override
    public void clear() {

        products.clear();

    }
}
