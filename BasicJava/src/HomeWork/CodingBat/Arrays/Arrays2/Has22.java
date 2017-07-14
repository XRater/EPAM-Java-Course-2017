package HomeWork.CodingBat.Arrays.Arrays2;

public class Has22 {

    public boolean has22(int[] nums) {
        boolean ans = false;
        for (int i = 1; i < nums.length; i++)
            if (nums[i] == 2 && nums[i - 1] == 2)
                ans = true;
        return ans;
    }

}
