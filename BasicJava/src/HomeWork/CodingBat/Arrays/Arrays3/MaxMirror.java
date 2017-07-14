package HomeWork.CodingBat.Arrays.Arrays3;

public class MaxMirror {

    public int maxMirror(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                int actual = 0;
                int jj = j;
                int ii = i;
                while (ii < n && jj >= 0 && nums[ii] == nums[jj]) {
                    actual++;
                    ii++;
                    jj--;
                }
                if (actual > max)
                    max = actual;
            }
        return max;
    }

}
