package codekamp;

import java.util.Random;

/**
 * Created by cerebro on 25/09/17.
 */
public class RandomGen {

    private static Random r = new Random();

    public static int nextInt(int upperLimit) {
        return r.nextInt(upperLimit);
    }

    public static int nextInt(int lowerLimit, int upperLimit) {
        return r.nextInt(upperLimit - lowerLimit) + lowerLimit;
    }
}
