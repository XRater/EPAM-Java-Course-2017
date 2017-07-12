package HomeWork.CodingBat.Arrays;

public class Has23 {

    public boolean has23(int[] nums) {
        boolean ans = false;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2 || nums[i] == 3)
                ans = true;
        return ans;
    }

}
