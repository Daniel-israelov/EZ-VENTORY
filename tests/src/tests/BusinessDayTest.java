package src.tests;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.ezVentory.BusinessDay;



public class BusinessDayTest {
    private BusinessDay businessDay = null;

    @BeforeEach
    void setUp() {
        businessDay = new BusinessDay("Seven am", "Eleven pm", "Sunday");
    }

    @AfterEach
    void tearDown(){
       businessDay = null;
    }

    @Test
    void testEmptyDayList(){
        assertTrue(businessDay.getDay().isEmpty(), "list is not empty");
    }

}

