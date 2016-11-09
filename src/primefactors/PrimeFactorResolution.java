package primefactors;

/**
 * Created by Timea_Csiszar on 11/3/2016.
 */
public class PrimeFactorResolution {

    public int resolveWith2(int number) {

        if(number == 0) {
            return 0;
        }

        int numberOfDivider = 0;
        int numberAfterDivide = number;

        while (numberAfterDivide % 2 == 0) {
            numberAfterDivide = numberAfterDivide / 2;
            numberOfDivider++;
        }

        return numberOfDivider;
    }
}
