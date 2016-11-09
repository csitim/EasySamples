package avgdiff;

import java.util.List;

/**
 * Created by Timea_Csiszar on 11/7/2016.
 */
public class AvgCalculator {

    private static final int MAX_DIFF_FROM_AVG = 10;

    public long countNumberOfElementsWithLargeDiffFromAVG(List<Double> numbers) {
        double avg = calculateAVG(numbers);
        return numbers.stream().filter(n -> Math.abs(n - avg) > MAX_DIFF_FROM_AVG).count();
    }

    public double calculateAVG(List<Double> numbers) {
        return numbers.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }
}
