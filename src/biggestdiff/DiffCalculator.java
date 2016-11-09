package biggestdiff;

/**
 * Created by Timea_Csiszar on 11/3/2016.
 */
public class DiffCalculator {

    public int calculateBiggestDiff(int[] array) {
        int biggestDiff = 0;
        int actualDiff = 0;
        for (int i = 0; i < array.length - 1; i++) {
            actualDiff = Math.abs(array[i] - array[i + 1]);
            if (actualDiff > biggestDiff) {
                biggestDiff = actualDiff;
            }
        }
        return biggestDiff;
    }


}
