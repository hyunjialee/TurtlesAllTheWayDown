import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {

    @Test
    public void testFactorial(){;

        int expected = 24;

        int actual = Factorial.factorial(4);

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testFactorial1(){

        int expected = 1;
        int actual = Factorial.factorial(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorialSpeed(){
        Instant start = Instant.now();
        Factorial.factorial(500);
        Instant finish = Instant.now();

        Instant start1 = Instant.now();
        Factorial.factorial(1);
        Instant finish2 = Instant.now();

        long timeElapsed = Duration.between(start, finish).toNanos();
        long timeElapsed1 = Duration.between(start1, finish2).toNanos();

        Assert.assertTrue(timeElapsed > timeElapsed1);


    }

    @Test
    public void testGCD(){

        int expected = 12;
        int actual = GCD.gcd(12,36);

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testGCD1(){

        Instant start = Instant.now();
        GCD.gcd(30, 360);
        Instant finish = Instant.now();

        Instant start1 = Instant.now();
        GCD.gcd(30, 210);
        Instant finish2 = Instant.now();

        long timeElapsed = Duration.between(start, finish).toNanos();
        long timeElapsed1 = Duration.between(start1, finish2).toNanos();

        Assert.assertTrue(timeElapsed > timeElapsed1);

    }


}