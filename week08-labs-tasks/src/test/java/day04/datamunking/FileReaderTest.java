package day04.datamunking;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void findSmallestTemperatureSpreadTest() {

        Path path = Paths.get("src/main/resources/datamunging/weather.dat");

        FileReader fileReader = new FileReader();
        assertEquals(14,fileReader.findSmallestTemperatureSpread(path));
    }


    @Test
    void findSmallestDifferenceTest() {
        Path path = Paths.get("src/main/resources/datamunging/football.dat");

        FileReader fileReader = new FileReader();
        assertEquals("Aston_Villa",fileReader.findSmallestDifference(path));

    }


}