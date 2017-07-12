package HomeWork.CodingBat.Arrays.Arrays1;

public class Sum2 {

    public int sum2(int[] nums) {
        int s = 0;
        for (int i = 0; i < 2 && i < nums.length; i++)
            s += nums[i];
        return s;
    }

}
