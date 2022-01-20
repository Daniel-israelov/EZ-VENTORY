package src.tests;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.ezVentory.Report;

import static org.junit.jupiter.api.Assertions.*;


public class ReportTest {
    Report report = null;

    @BeforeEach
    void setUp() {
        report = new Report();
    }


}

