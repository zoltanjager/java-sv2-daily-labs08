package day04.datamunking;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileReader2Test {

    @Test
    void findSmallestTemperatureSpreadTest() {

        Path path = Paths.get("src/main/resources/datamunging/weather.dat");

        FileReader2 fileReader = new FileReader2();
        assertEquals(14,fileReader.findSmallestTemperatureSpread(path));
    }


    @Test
    void findSmallestDifferenceTest() {
        Path path = Paths.get("src/main/resources/datamunging/football.dat");

        FileReader2 fileReader = new FileReader2();
        assertEquals("Aston_Villa",fileReader.findSmallestDifference(path));

    }
}