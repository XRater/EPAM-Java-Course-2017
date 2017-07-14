package HomeWork.CodingBat.Arrays.Arrays2;

public class Sum67 {

    public int sum67(int[] nums) {
        int mode = 1;
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6)
                mode = 2;
            if (mode == 1)
                s += nums[i];
            if (nums[i] == 7)
                mode = 1;
        }
        return s;
    }

}
