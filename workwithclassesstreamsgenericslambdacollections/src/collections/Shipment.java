package collections;

import java.util.*;

public class Shipment implements Iterable<Product>, Comparator<Product> {

    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private final List<Product> products = new ArrayList<>();
    private List<Product> lightVanProducts;
    private List<Product> heavyVanProducts;

    public void add(Product product){
        products.add(product);

    }

    public boolean replace(Product oldProduct, Product newProduct){
        int position = products.indexOf(oldProduct);
        if(position == -1){
            return false;
        }else {
            products.set(position, newProduct);
            return true;
        }
    }

    public void prepare(){
        //Sort the productlist
        products.sort(Product.BY_WEIGHT);

        //find the  split points
        int splitPoints = findSplitPoint();

        // create two subviews of the list
        lightVanProducts =  products.subList(0, splitPoints);

        //Sample of unmodifiable factory
//        lightVanProducts = Collections.unmodifiableList(products.subList(0, splitPoints));
        heavyVanProducts = products.subList(splitPoints, products.size());

    }

    public List<Product> getLightVanProducts() {
        return lightVanProducts;
    }

    public List<Product> getHeavyVanProducts() {
        return heavyVanProducts;
    }

    private int findSplitPoint() {

        int size  = products.size();
        for(int i = 0 ; i< size; i++){
            Product product = products.get(i);
            if (product.getWeight() > LIGHT_VAN_MAX_WEIGHT)
            {
                return i;
            }
        }

        return 0;
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    @Override
    public int compare(Product o1, Product o2) {
        return 0;
    }
}
