package src.tests;

import org.junit.jupiter.api.AfterEach;
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
        store = new Store("Super-Pharm");
        supplier = new Supplier("Coca Cola", 777);
        item = new Item("Cola", "123456", 3.26,4.9,45, true);
    }

    @AfterEach
    void tearDown(){
        store = null;
        supplier = null;
        item = null;
    }

    @Test
    void testEmptyList(){
        assertTrue(supplier.getItems().isEmpty(), "list is not empty");
    }

    @Test
    void testAddItem(){
        assertTrue(supplier.addItem(item, store), "failed to add item");
    }

    @Test
    void testRemoveItem(){
        assertTrue(supplier.removeItem(item), "failed to remove item");
    }
    @Test
    void testRemoveItemNotInList(){
        assertFalse(supplier.removeItem(item), "item should not be on list");
    }
}