package src.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.ezVentory.Item;
import src.ezVentory.OnSale;
import static org.junit.jupiter.api.Assertions.*;

class OnSaleTest {
    private OnSale onSale = null;
    private Item item = null;

    @BeforeEach
    void setUp(){
        item = new Item("bamba", "123456", 3.26,4.9,45, true);
        onSale = new OnSale();
    }

    @Test
    void testEmptyList(){
        assertTrue(onSale.getItems().isEmpty(), "list is not empty");
    }

    @Test
    void testAddItem() {
        onSale.addItem(item);
        assertEquals(1,onSale.getItems().size(), "list is empty");
    }

    @Test
    void testRemoveItem() {
        onSale.removeItem(item);
        assertEquals(0, onSale.getItems().size(), "list is not empty");
    }

    @Test
    void testRemoveItemNotOnList(){
        assertFalse(onSale.removeItem(item), "item should not be on list");
    }
}