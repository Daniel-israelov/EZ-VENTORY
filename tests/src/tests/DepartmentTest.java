package src.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.ezVentory.Department;
import src.ezVentory.Item;
import src.ezVentory.Store;


public class DepartmentTest {
    Department department = null;
    Item item = null;
    Store store = null;

    @BeforeEach
    void setUp() {
        store = Store.getInstance();
        department = new Department("Drinks", 111);
        item = new Item("Coca-Cola Zero", "123456", 3.26, 4.9);
    }

    @AfterEach
    void tearDown() {
        store = null;
        department = null;
        item = null;
    }

    @Test
    void testEmptyList(){
        assertTrue(department.getItemsList().isEmpty(), "list is not empty");
    }

    @Test
    void testAddItem(){
        assertTrue(department.addItem(item), "failed to add item");
    }

    @Test
    void testRemoveItem(){
        assertTrue(department.removeItem(item), "failed to remove item");
    }
    @Test
    void testRemoveItemNotInList(){
        assertFalse(department.removeItem(item), "item should not be on list");
    }
}






