package HomeWork.CodingBat.Arrays.Arrays2;

public class TripleUp {

    public boolean tripleUp(int[] nums) {
        boolean answer = false;
        for (int i = 2; i < nums.length; i++)
            if (nums[i] - 1 == nums[i - 1] && nums[i] - 2 == nums[i - 2])
                answer = true;
        return answer;
    }

}
