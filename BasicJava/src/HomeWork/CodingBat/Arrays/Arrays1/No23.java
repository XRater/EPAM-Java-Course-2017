package HomeWork.CodingBat.Arrays.Arrays1;

public class No23 {

    public boolean no23(int[] nums) {
        boolean ans = false;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2 || nums[i] == 3)
                ans = true;
        return !ans;
    }

}
