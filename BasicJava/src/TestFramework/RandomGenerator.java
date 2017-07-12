package TestFramework;

import java.util.Random;

public class RandomGenerator {

    public static void generate_random_array(int[] array, int maxInt) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(maxInt);
    }

    //WARNING this method works badly if (maxInt - minInt) > Intger.MAX_VALUE
    public static void generate_random_array(int[] array, int minInt, int maxInt) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(maxInt - minInt) - minInt;
    }
}
