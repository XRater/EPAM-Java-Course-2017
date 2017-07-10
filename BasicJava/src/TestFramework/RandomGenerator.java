package TestFramework;

import java.util.Random;

public class RandomGenerator {

    public static int[] generate_random_array(int[] array, int max_rand) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(max_rand);

        return array;
    }
}
