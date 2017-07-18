package HomeWork.CodingBat.Arrays.Arrays2;

public class ShiftLeft {

    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0)
            return nums;
        int[] ans = new int[nums.length];
        int i = 0;
        while (i + 1 != nums.length)
            ans[i] = nums[++i];
        ans[i] = nums[0];
        return ans;
    }

}
