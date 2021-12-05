package day05;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TeamsFileReaderTest {

    @Test
    void testTeamsFileReader()
    {
        String result = new TeamsFileReader().findSmallestDifferenceName();
        assertEquals("Aston_Villa", result);
    }
    @Test
    void testTemperatureFileReader()
    {
        String result = new TemperatureFileReader().findSmallestDifferenceName();
        assertEquals("14", result);
    }
}