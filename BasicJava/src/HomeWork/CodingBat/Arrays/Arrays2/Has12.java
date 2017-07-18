package HomeWork.CodingBat.Arrays.Arrays2;

public class Has12 {

    public boolean has12(int[] nums) {
        boolean is1 = false;
        boolean is2 = false;
        for (int value : nums) {
            if (is1 && value == 2)
                is2 = true;
            if (value == 1)
                is1 = true;
        }
        return is2;
    }

}
