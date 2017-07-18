package HomeWork.CodingBat.Arrays.Arrays2;

public class TwoTwo {

    public boolean twoTwo(int[] nums) {
        boolean ans = true;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2) {
                if ((i == 0 || nums[i - 1] != 2) && (i == nums.length - 1 || nums[i + 1] != 2))
                    ans = false;
            }
        return ans;
    }

}
