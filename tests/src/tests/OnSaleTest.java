package src.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.ezVentory.Item;
import src.ezVentory.OnSale;


import static org.junit.jupiter.api.Assertions.assertEquals;

class OnSaleTest {

    private final Item item = new Item("bamba", "123456", 3.26,4.9,45, false);
    private final OnSale onSale = new OnSale();

    @Test
    void addItem() {
        //NOT working :(
        assertEquals("false",onSale.addItem(item));
    }

    @Test
    void removeItem() {
    }
}