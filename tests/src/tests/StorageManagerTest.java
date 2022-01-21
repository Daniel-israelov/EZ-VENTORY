package src.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.ezVentory.StorageManager;

import static org.junit.jupiter.api.Assertions.*;

class StorageManagerTest {

    StorageManager smanager = null;

    @BeforeEach
    void setUp() {
        smanager = new StorageManager("dan","dann","31515151","1245","1");
    }

    @AfterEach
    void tearDown() {
        smanager=null;
    }

    @Test
    void testGetName(){
        assertTrue(smanager.getItems().isEmpty(), "list is not empty");
    }
}