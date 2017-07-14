package HomeWork.CodingBat.Arrays.Arrays3;

public class CanBalance {

    public boolean canBalance(int[] nums) {
        int s = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++)
            s += nums[i];
        int tmps = 0;
        for (int i = 0; i < n; i++) {
            tmps += nums[i];
            if (tmps == s - tmps)
                return true;
        }
        return false;
    }

}
