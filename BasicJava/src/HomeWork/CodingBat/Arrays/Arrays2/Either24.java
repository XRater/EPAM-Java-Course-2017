package HomeWork.CodingBat.Arrays.Arrays2;

public class Either24 {

    public boolean either24(int[] nums) {
        boolean next2 = false;
        boolean next4 = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i - 1] == 2)
                next2 = true;
            if (nums[i] == 4 && nums[i - 1] == 4)
                next4 = true;
        }
        return next2 ^ next4;
    }

}
