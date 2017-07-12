package HomeWork.CodingBat.Arrays.Arrays1;

public class RotateLeft3 {

    public int[] rotateLeft3(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        while (i + 1 != nums.length)
            ans[i] = nums[++i];
        ans[i] = nums[0];
        return ans;
    }

}
