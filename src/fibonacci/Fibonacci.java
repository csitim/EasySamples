package fibonacci;

/**
 * Created by Timea_Csiszar on 11/3/2016.
 */
public class Fibonacci {

    public boolean isFibonacciNumber(int number) {

        if (number < 0) return false;
        if (number == 0) return true;
        if (number == 1) return true;

        int prevElement = 1;
        int actualElement = 1;

        while (actualElement < number) {
            int nextElement = prevElement + actualElement;
            if (nextElement == number) {
                return true;
            }

            prevElement = actualElement;
            actualElement = nextElement;
        }

        return false;

    }
}
