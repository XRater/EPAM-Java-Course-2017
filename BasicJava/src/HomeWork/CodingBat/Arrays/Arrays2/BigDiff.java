package HomeWork.CodingBat.Arrays.Arrays2;

public class BigDiff {

    public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return max - min;
    }

}
