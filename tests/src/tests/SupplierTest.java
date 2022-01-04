package src.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.ezVentory.Item;
import src.ezVentory.Store;
import src.ezVentory.Supplier;
import static org.junit.jupiter.api.Assertions.*;

class SupplierTest {
    Supplier supplier = null;
    Item item = null;
    Store store = null;

    @BeforeEach
    void setUp(){
        supplier = new Supplier("Coca Cola", 777);
        item = new Item("Cola", "123456", 3.26,4.9,45, true);
    }

    @Test
    void testEmptyList(){
        assertTrue(supplier.getItems().isEmpty(), "list is not empty");
    }

    @Test
    void testAddItem(){
        assertTrue(supplier.addItem(item, store));
    }

    @Test
    void testRemoveItem(){
        assertTrue(supplier.removeItem(item));
    }
}