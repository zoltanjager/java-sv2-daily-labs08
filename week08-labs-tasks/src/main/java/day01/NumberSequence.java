package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {
    private List<Integer> numbers = new ArrayList<>();
    private int numbersToGenerate;
    private int min;
    private int max;

    public NumberSequence(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public NumberSequence(int numbersToGenerate, int min, int max) {
        this.numbersToGenerate = numbersToGenerate;
        this.min = min;
        this.max = max;
        fillList(numbersToGenerate, min, max);
    }

    public List<Integer> closeToAverage(int value) {
        double average = calculateAverage();
        List<Integer> result = new ArrayList<>();
        for (int actual : numbers ) {
            if (Math.abs(actual-average)<=value){
                result.add(actual);
            }
        }
        return result;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    private int generateNumbers(int min, int max) {
        Random rnd = new Random();
        int  randomNumber = rnd.nextInt(min, max+1);
        return  randomNumber;
    }

    private void fillList (int numbersToGenerate, int min, int max) {
        for (int i = 0; i < numbersToGenerate; i++) {
            numbers.add(generateNumbers(min, max));
        }
    }

    private double calculateAverage() {
        double sum = 0;
        for (int actual : numbers ) {
            sum += actual;
        }
        return sum / numbers.size();
    }
}
