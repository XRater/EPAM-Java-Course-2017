package HomeWork.CodingBat.Arrays.Arrays2;

public class Lucky13 {

    public boolean lucky13(int[] nums) {
        boolean ans = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3)
                return false;
            if (nums[i] == 1)
                ans = false;
        }
        return ans;
    }

}
