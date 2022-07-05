package collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ShipmentTest {

    public static Product door = new  Product(1, "Wooden Door",  35);
    public static Product floorPanel = new  Product(2, "Floor Panel",  25);
    public static Product window = new  Product(3, "Glass Window",  10);

    private Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems(){
        shipment.add(door);
        shipment.add(window);
        //assertThat(shipment, contains(door, window));
        
    }

    @Test
    public void shouldRemoveItems(){
        shipment.add(door);
        shipment.add(window);
     //  assertThat(shipment, contains(door, window));

    }

    @Test
    public void shouldNotReplaceMissingItems(){
        shipment.add(door);
        shipment.add(window);

        assertFalse(shipment.replace(door, floorPanel));
        //  assertThat(shipment, contains(door, window));

    }
}
