package HomeWork.CodingBat.Arrays.Arrays2;

public class Has77 {

    public boolean has77(int[] nums) {
        if (nums.length < 2)
            return false;
        if (nums[0] == 7 && nums[1] == 7)
            return true;
        for (int i = 2; i < nums.length; i++)
            if ((nums[i] == 7 && nums[i - 1] == 7) || (nums[i - 2] == 7 && nums[i] == 7))
                return true;
        return false;
    }

}
