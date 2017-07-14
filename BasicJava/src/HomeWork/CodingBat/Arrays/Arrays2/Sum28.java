package HomeWork.CodingBat.Arrays.Arrays2;

public class Sum28 {

    public boolean sum28(int[] nums) {
        int s = 0;
        for (int value : nums)
            if (value == 2)
                s += value;
        return s == 8;
    }

}
