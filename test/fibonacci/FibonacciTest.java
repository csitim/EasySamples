package fibonacci;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Timea_Csiszar on 11/3/2016.
 */
public class FibonacciTest {

    @Test
    public void test() {

        Fibonacci fibonacci = new Fibonacci();

        Assert.assertEquals("Is number -2 a Fibonacci number?", Boolean.FALSE, fibonacci.isFibonacciNumber(-2));
        Assert.assertEquals("Is number 0 a Fibonacci number?", Boolean.TRUE, fibonacci.isFibonacciNumber(0));
        Assert.assertEquals("Is number 1 a Fibonacci number?", Boolean.TRUE, fibonacci.isFibonacciNumber(1));
        Assert.assertEquals("Is number 2 a Fibonacci number?", Boolean.TRUE, fibonacci.isFibonacciNumber(2));
        Assert.assertEquals("Is number 3 a Fibonacci number?", Boolean.TRUE, fibonacci.isFibonacciNumber(3));
        Assert.assertEquals("Is number 4 a Fibonacci number?", Boolean.FALSE, fibonacci.isFibonacciNumber(4));
        Assert.assertEquals("Is number 5 a Fibonacci number?", Boolean.TRUE, fibonacci.isFibonacciNumber(5));
        Assert.assertEquals("Is number 6 a Fibonacci number?", Boolean.FALSE, fibonacci.isFibonacciNumber(6));

        Assert.assertEquals("Is number 55 a Fibonacci number?", Boolean.TRUE, fibonacci.isFibonacciNumber(55));
        Assert.assertEquals("Is number 56 a Fibonacci number?", Boolean.FALSE, fibonacci.isFibonacciNumber(56));

        Assert.assertEquals("Is number 89 a Fibonacci number?", Boolean.TRUE, fibonacci.isFibonacciNumber(89));
        Assert.assertEquals("Is number 88 a Fibonacci number?", Boolean.FALSE, fibonacci.isFibonacciNumber(88));

    }
}
