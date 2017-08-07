package ClassWork.p040817;

import java.util.Arrays;
import java.util.List;

class WildcardsExamples {

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1, 2, 3);

//        List<Number> nums = ints;

        fill(ints);
    }

    private static void fill(List<? extends Number> ints) {
        
    }

}
