package src.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.ezVentory.Item;
import src.ezVentory.OnSale;
import static org.junit.jupiter.api.Assertions.assertEquals;


class OnSaleTest {
    private OnSale onSale = null;
    Item item = null;

    @BeforeEach
    void setUp(){
        Item item = new Item("bamba", "123456", 3.26,4.9,45, false);
        OnSale onSale = new OnSale();
    }

    @Test
    void testEmptyList(){
        assertEquals(0, onSale.getItems().size(), "list is not empty");
    }

    @Test
    void testAddItem() {
        onSale.addItem(item);
        assertEquals("false",onSale.addItem(item));
    }

    @Test
    void testRemoveItem() {
    }
}