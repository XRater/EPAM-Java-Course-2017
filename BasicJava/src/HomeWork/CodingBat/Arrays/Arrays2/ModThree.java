package HomeWork.CodingBat.Arrays.Arrays2;

public class ModThree {

    public boolean modThree(int[] nums) {
        boolean answer = false;
        for (int i = 2; i < nums.length; i++)
            answer |= (nums[i - 2] % 2 == nums[i - 1] % 2 && nums[i - 1] % 2 == nums[i] % 2);
        return answer;
    }

}
