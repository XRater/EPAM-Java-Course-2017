package HomeWork.CodingBat.Arrays.Arrays2;

public class NotAlone {

    public int[] notAlone(int[] nums, int val) {
        int[] answer = new int[nums.length];
        System.arraycopy(nums, 0, answer, 0, nums.length);
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
                answer[i] = Math.max(nums[i - 1], nums[i + 1]);
        }
        return answer;
    }

}
