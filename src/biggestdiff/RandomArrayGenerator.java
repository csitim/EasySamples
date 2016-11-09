package biggestdiff;

import java.util.Random;

/**
 * Created by Timea_Csiszar on 11/3/2016.
 */
public class RandomArrayGenerator {

    public int[] generate(int length) {

        int[] generatedArray = new int[length];

        Random randomGenerator = new Random();
        for (int i = 0; i < length; i++) {
            int randomInt = randomGenerator.nextInt(100);
            generatedArray[i] = randomInt;
            System.out.println("Generated[" + i + "]=" + randomInt);
        }

        return generatedArray;
    }
}
