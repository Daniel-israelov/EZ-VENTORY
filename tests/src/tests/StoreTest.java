package src.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.ezVentory.*;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    Store store = null;
    Employee employee = null;
    Department department = null;
    Supplier supplier = null;

    @BeforeEach
    void setUp(){
        store = new Store("Super Pharm");
        employee = new Manager("Yarin", "Agam", "123456789", "1234", 1);
        department = new Department("Food",0);
        supplier = new Supplier("Coca Cola", 777);
    }

    @AfterEach
    void tearDown(){
        store = null;
        employee = null;
        department = null;
        supplier = null;
    }

    @Test
    void testAddNotExistedDepartment(){
            assertTrue(store.addDepartment(department), "department is not empty");
    }

    @Test
    void testAddExistedDepartment(){
        store.addDepartment(department);
        assertFalse(store.addDepartment(department), "department added again");
    }

    @Test
    void testRemoveExistedDepartment(){
        store.addDepartment(department);
        assertTrue(store.removeDepartment(department), "department hasn't removed");
    }

    @Test
    void testRemoveNotExistedDepartment() {
        assertFalse(store.removeDepartment(department), "removed not existed department");
    }

    @Test
    void testRemoveExistedDay(){
        BusinessDay day = new BusinessDay("9:00","22:00","monday");
        assertTrue(store.removeDay(day.getDay()), "did not remove existed day");
    }

    @Test
    void testRemoveNotExistedDay(){
        assertFalse(store.removeDay("Monday"),"removed day even when not existed");
    }

    @Test
    void testAddExistedEmployee() {
        store.addEmployee(employee);
        assertFalse(store.addEmployee(employee),"added existed employee");
    }

    @Test
    void testAddNotExistedEmployee() {
        assertTrue(store.addEmployee(employee),"didn't add employee");
    }

    @Test
    void testRemoveExistedEmployee(){
        store.addEmployee(employee);
        assertTrue(store.removeEmployee(employee),"didn't remove existed employee");
    }

    @Test
    void testRemoveNotExistedEmployee(){
        assertFalse(store.removeEmployee(employee),"removed not existed employee");
    }

    @Test
    void testAddExistedSupplier(){
        store.addSupplier(supplier);
        assertTrue(store.addSupplier(supplier),"added existed supplier");
    }

    @Test
    void testAddNotExistedSupplier(){
        assertTrue(store.addSupplier(supplier),"supplier hasn't been added");
    }

    @Test
    void testRemoveExistedSupplier(){
        store.addSupplier(supplier);
        assertTrue(store.removeSupplier(supplier),"supplier hasn't been removed");
    }

    @Test
    void testRemoveNotExistedSupplier(){
        assertFalse(store.removeSupplier(supplier),"removed not existed supplier");
    }
}