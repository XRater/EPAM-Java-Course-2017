package HomeWork.CodingBat.Arrays.Arrays2;

public class Post4 {

    public int[] post4(int[] nums) {
        int last = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 4)
                last = i + 1;
        int[] ans = new int[nums.length - last];
        System.arraycopy(nums, last, ans, 0, ans.length);
        return ans;
    }

}
