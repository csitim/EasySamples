package avgdiff;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Timea_Csiszar on 11/7/2016.
 */
public class AvgCalculatorTest {

    @Test(expected = NullPointerException.class)
    public void nullListAvgTest() {
        AvgCalculator avgCalculator = new AvgCalculator();

        List<Double> emptyList = null;
        double avg = avgCalculator.calculateAVG(emptyList);
    }

    @Test
    public void emptyListAvgTest() {
        AvgCalculator avgCalculator = new AvgCalculator();

        List<Double> emptyList = new ArrayList<>();
        double avg = avgCalculator.calculateAVG(emptyList);

        Assert.assertEquals("Expected: 0, actual: " + avg, 0.0, avg, 0.0);
    }

    @Test
    public void oneElementListAvgTest() {
        AvgCalculator avgCalculator = new AvgCalculator();

        List<Double> numbers = new ArrayList<>();
        numbers.add(1.1);
        double avg = avgCalculator.calculateAVG(numbers);

        Assert.assertEquals("Expected: 1.1, actual: " + avg, 1.1, avg, 0.0);
    }

    @Test
    public void twoElementListAvgTest() {
        AvgCalculator avgCalculator = new AvgCalculator();

        List<Double> numbers = new ArrayList<>();
        numbers.add(1.1);
        numbers.add(1.0);
        double avg = avgCalculator.calculateAVG(numbers);

        Assert.assertEquals("Expected: 1.05, actual: " + avg, 1.05, avg, 0.0);
    }

    @Test
    public void moreElementListAvgTest() {
        AvgCalculator avgCalculator = new AvgCalculator();

        List<Double> numbers = new ArrayList<>();
        numbers.add(1.1);
        numbers.add(1.0);
        numbers.add(-1.0);
        numbers.add(0.5);
        numbers.add(100.0);
        numbers.add(101.0);
        double avg = avgCalculator.calculateAVG(numbers);

        Assert.assertEquals("Expected: 33.766, actual: " + avg, 33.766, avg, 0.001);
    }

    @Test
    public void emptyListAvgDiffTest() {
        AvgCalculator avgCalculator = new AvgCalculator();

        List<Double> emptyList = new ArrayList<>();
        long count = avgCalculator.countNumberOfElementsWithLargeDiffFromAVG(emptyList);

        Assert.assertEquals("Expected: 0, actual: " + count, 0, count, 0);
    }

    @Test
    public void oneElementAvgDiffTest() {
        AvgCalculator avgCalculator = new AvgCalculator();

        List<Double> numbers = new ArrayList<>();
        numbers.add(1.1);
        long count = avgCalculator.countNumberOfElementsWithLargeDiffFromAVG(numbers);

        Assert.assertEquals("Expected: 0, actual: " + count, 0, count, 0);
    }

    @Test
    public void moreElementAvgDiffTestWithAllOfElementsInBounds() {
        AvgCalculator avgCalculator = new AvgCalculator();

        List<Double> numbers = new ArrayList<>();
        numbers.add(1.1);
        numbers.add(1.0);
        numbers.add(-1.0);
        numbers.add(2.5);
        numbers.add(10.0);
        numbers.add(9.0);

        double avg = avgCalculator.calculateAVG(numbers);
        Assert.assertEquals("Expected: 3.766, actual: " + avg, 3.766, avg, 0.001);

        long count = avgCalculator.countNumberOfElementsWithLargeDiffFromAVG(numbers);
        Assert.assertEquals("Expected: 0, actual: " + count, 0, count, 0);
    }

    @Test
    public void moreElementAvgDiffTestWithOneElementOutOfBounds() {
        AvgCalculator avgCalculator = new AvgCalculator();

        List<Double> numbers = new ArrayList<>();
        numbers.add(1.1);
        numbers.add(1.0);
        numbers.add(-1.0);
        numbers.add(2.5);
        numbers.add(10.0);
        numbers.add(40.0);

        double avg = avgCalculator.calculateAVG(numbers);
        Assert.assertEquals("Expected: 8.933, actual: " + avg, 8.933, avg, 0.001);

        long count = avgCalculator.countNumberOfElementsWithLargeDiffFromAVG(numbers);
        Assert.assertEquals("Expected: 1, actual: " + count, 1, count, 0);
    }

    @Test
    public void moreElementAvgDiffTestWithAllElementsOutOfBounds() {
        AvgCalculator avgCalculator = new AvgCalculator();

        List<Double> numbers = new ArrayList<>();
        numbers.add(1.1);
        numbers.add(1.0);
        numbers.add(-1.0);
        numbers.add(2.5);
        numbers.add(10.0);
        numbers.add(1000.0);

        double avg = avgCalculator.calculateAVG(numbers);
        Assert.assertEquals("Expected: 168.933, actual: " + avg, 168.933, avg, 0.001);

        long count = avgCalculator.countNumberOfElementsWithLargeDiffFromAVG(numbers);
        Assert.assertEquals("Expected: 6, actual: " + count, 6, count, 0);
    }




}
