package HomeWork.CodingBat.Arrays.Arrays2;

public class IsEverywhere {

    public boolean isEverywhere(int[] nums, int val) {
        boolean answer = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != val && nums[i - 1] != val)
                answer = false;
        }
        return answer;
    }

}
