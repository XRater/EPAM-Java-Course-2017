package HomeWork.CodingBat.Arrays.Arrays2;

public class TenRun {

    public int[] tenRun(int[] nums) {
        boolean change = false;
        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                change = true;
                last = nums[i];
            }
            if (change)
                nums[i] = last;
        }
        return nums;
    }

}
