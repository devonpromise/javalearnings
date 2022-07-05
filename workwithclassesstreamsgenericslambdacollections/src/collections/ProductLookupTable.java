package collections;

public interface ProductLookupTable {

    Product lookupByid(int id);

    void addProduct(Product productToAdd);

    void clear();

}
