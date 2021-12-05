package day04.datamunking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public String findSmallestDifference(Path path) {
        String team = null;
        try {
            List<String> lines = Files.readAllLines(path);
            int diff = Integer.MAX_VALUE;
            for (int i = 1; i < lines.size() - 1; i++) {

                if (i != 18 ) {
                    int number1 = Integer.parseInt(lines.get(i).substring(43, 45).trim());
                    int number2 = Integer.parseInt(lines.get(i).substring(50, 52).trim());
                    if (Math.abs(number1 - number2) < diff) {
                        diff = Math.abs(number1 - number2);
                        team = lines.get(i).substring(7, 23).trim();
                    }
                }

            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);

        }
        return team;
    }

    public int findSmallestTemperatureSpread(Path path) {
        int day = 0;
        try {

            List<String> lines = Files.readAllLines(path);
            int diff = Integer.MAX_VALUE;

            for (int i = 2; i < lines.size() - 1; i++) {
                int max = Integer.parseInt(lines.get(i).substring(6, 8).trim());
                int min = Integer.parseInt(lines.get(i).substring(12, 14).trim());
                if (max - min < diff) {
                    diff = max - min;
                    day = Integer.parseInt(lines.get(i).substring(2, 4).trim());
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return day;
    }

}
