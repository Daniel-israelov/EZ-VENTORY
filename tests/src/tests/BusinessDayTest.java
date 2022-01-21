package src.tests;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.ezVentory.BusinessDay;
import src.ezVentory.Store;



public class BusinessDayTest {
    private BusinessDay businessDay = null;
    private Store store = null;

    @BeforeEach
    void setUp() {
        businessDay = new BusinessDay("Seven am", "Eleven pm", "Sunday");
        store=new Store("AM:PM");
    }

    @AfterEach
    void tearDown(){
       businessDay = null;
    }

    @Test
    void testEmptyDayList(){
        assertFalse(businessDay.getDay().isEmpty(), "list is empty");
    }


}

