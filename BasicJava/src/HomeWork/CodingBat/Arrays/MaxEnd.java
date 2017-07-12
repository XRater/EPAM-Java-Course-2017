package HomeWork.CodingBat.Arrays;

public class MaxEnd {

    public int[] maxEnd3(int[] nums) {
        int m = nums[0] > nums[2] ? nums[0] : nums[2];
        int[] ans = {m, m, m};
        return ans;
    }

}
