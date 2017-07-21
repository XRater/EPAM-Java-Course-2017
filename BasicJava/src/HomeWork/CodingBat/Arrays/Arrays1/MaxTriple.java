package HomeWork.CodingBat.Arrays.Arrays1;

class MaxTriple {

    public int maxTriple(int[] nums) {
        int max = nums[0];
        max = Math.max(max, nums[nums.length - 1]);
        max = Math.max(max, nums[nums.length / 2]);
        return max;
    }

}
