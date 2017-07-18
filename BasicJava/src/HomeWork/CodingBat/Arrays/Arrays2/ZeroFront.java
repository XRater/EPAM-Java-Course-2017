package HomeWork.CodingBat.Arrays.Arrays2;

public class ZeroFront {

    public int[] zeroFront(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                nums[i] = nums[index];
                nums[index++] = 0;
            }
        }
        return nums;
    }

}
