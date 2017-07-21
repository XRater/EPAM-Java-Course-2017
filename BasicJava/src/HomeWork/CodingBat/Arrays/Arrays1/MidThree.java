package HomeWork.CodingBat.Arrays.Arrays1;

class MidThree {

    public int[] midThree(int[] nums) {
        int n = nums.length / 2;
        int[] ans = {nums[n - 1], nums[n], nums[n + 1]};
        return ans;
    }

}
