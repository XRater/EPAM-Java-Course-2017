package HomeWork.CodingBat.Arrays.Arrays2;

public class Pre4 {

    public int[] pre4(int[] nums) {
        int len = 0;
        while (nums[len] != 4)
            len++;
        int[] answer = new int[len];
        System.arraycopy(nums, 0, answer, 0, len);
        return answer;
    }

}
