package HomeWork.CodingBat.Arrays.Arrays1;

public class MakeEnds {

    public int[] makeEnds(int[] nums) {
        int[] ans = {nums[0], nums[nums.length - 1]};
        return ans;
    }

}
