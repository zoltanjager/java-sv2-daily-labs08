package day01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {

    @Test
    void createNumberSequenceWithAListTest () {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        NumberSequence numberSequence = new NumberSequence(numbers);

        assertEquals(6, numberSequence.getNumbers().size());
    }

    @Test
    void createNumberSequenceWithRandomTest () {

        NumberSequence numberSequence = new NumberSequence(6, 1, 6);

        assertEquals(6, numberSequence.getNumbers().size());
    }


    @Test
    void closeToAverageTest() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = new ArrayList<>();

        NumberSequence numberSequence = new NumberSequence(numbers);
        result = numberSequence.closeToAverage(2);
        assertEquals(4, result.size());
    }


}