package HomeWork.CodingBat.Arrays.Arrays2;

public class HaveThree {

    public boolean haveThree(int[] nums) {
        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i - 1] == 3)
                return false;
        }
        for (int value : nums)
            if (value == 3)
                cnt++;
        return cnt == 3;
    }

}
