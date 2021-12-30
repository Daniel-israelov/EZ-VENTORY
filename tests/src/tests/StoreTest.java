package src.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.ezVentory.Store;
//import src.ezVentory.Supplier;
import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    Store store = null;

    @BeforeEach
    void setUp(){
        store = new Store("Super Pharm");
    }

    @Test
    void testEmptyStore(){
        assertTrue(store.getName().isEmpty(), "list is not empty");
    }

    @Test
    void testAddItem(){
    }
}