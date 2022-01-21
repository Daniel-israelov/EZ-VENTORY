package src.tests;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.ezVentory.Report;
import src.ezVentory.BusinessDay;
import src.ezVentory.Economics;
import static org.junit.jupiter.api.Assertions.*;


public class ReportTest {
    Report report = null;
    BusinessDay businessDay = null;
    Economics economics = null;

    @BeforeEach
    void setUp() {
        report = new Report();
        businessDay = new BusinessDay("07:00","23:00","Sunday");
        economics = new Economics(5000);
    }
    @AfterEach
    void tearDown(){
        report=null;
        businessDay = null;
        economics = null;
    }

/*    @Test
    void dailyReportTest(){
        report.dailyReport(economics,businessDay);
        assertTrue(report.dailyReport());
    }*/
    @Test
    void departmentReportTest(){

    }
    @Test
    void supplierReportTest(){

    }
}

