package HomeWork.CodingBat.Arrays.Arrays2;

public class EvenOdd {

    public int[] evenOdd(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0) {
                int tmp = nums[i];
                nums[i] = nums[index];
                nums[index++] = tmp;
            }
        return nums;
    }

}
