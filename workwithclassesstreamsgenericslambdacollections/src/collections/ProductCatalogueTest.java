package collections;

import java.util.Collections;
/*import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;*/


public class ProductCatalogueTest {

    public static Product door = new Product(1,"Wooden Door", 35);
    public static Product floorPanel = new Product(2,"Floor Panel", 25);
    public static Product window = new Product(3,"Glass Window", 10);

    public void shouldNotRecordDuplicateProducts(){
        Supplier1 johnsGlazing = new Supplier1("John's Glazing");
        johnsGlazing.getProducts().add(window);

        Supplier1 allPurpose = new Supplier1("All Purpose Supplies Ltd.");
        Collections.addAll(allPurpose.getProducts(), door, floorPanel, window);

        ProductCatalogue catalogue = new ProductCatalogue();
        catalogue.addSupplier(johnsGlazing);
        catalogue.addSupplier(allPurpose);

        //assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));


    }


}
