package HomeWork.CodingBat.Arrays.Arrays3;

public class Fix34 {

    public int[] fix34(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 3) {
                for (int j = 0; j < n; j++) {
                    if (nums[j] == 4 && ( j == 0 || nums[j - 1] != 3)) {
                        int tmp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = tmp;
                        j = n;
                    }
                }
            }
        }
        return nums;
    }

}
