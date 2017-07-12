package HomeWork.CodingBat.Arrays.Arrays1;

public class MakeLast {

    public int[] makeLast(int[] nums) {
        int[] ans = new int[nums.length * 2];
        ans[ans.length - 1] = nums[nums.length - 1];
        return ans;
    }

}
