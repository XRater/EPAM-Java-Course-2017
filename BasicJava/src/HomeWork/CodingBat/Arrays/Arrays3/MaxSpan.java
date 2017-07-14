package HomeWork.CodingBat.Arrays.Arrays3;

public class MaxSpan {

    public int maxSpan(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int max = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j  < n; j++) {
                if (nums[j] == nums[i] && (j - i > max))
                    max = j - i;
            }
        return max + 1;
    }

}
