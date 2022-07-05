package collections;

import java.util.List;

public class ShipmentsBreaker {
    public static Product door = new Product(1,"Wooden Door", 35);
    public static Product floorPanel = new Product(2,"Floor", 25);
    public static  Product window = new Product(3, "Glass Window", 10);

    public static void main (String[] args){

        //Sample of unmodifiable factory

        Shipment shipment = new Shipment();

        shipment.add(door);
        shipment.add(window);
        shipment.add(door);
        shipment.add(window);
        shipment.add(floorPanel);

        shipment.prepare();

        List<Product> lightVanProducts = shipment.getLightVanProducts();

        System.out.println("lightVanProducts = "+ lightVanProducts);

        lightVanProducts.remove(window);

        System.out.println("Shipment = " +  shipment.getLightVanProducts());
        shipment.forEach(prod -> System.out.println(prod));

    }


}
