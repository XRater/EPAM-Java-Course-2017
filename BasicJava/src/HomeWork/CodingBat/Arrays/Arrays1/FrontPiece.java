package HomeWork.CodingBat.Arrays.Arrays1;

class FrontPiece {

    public int[] frontPiece(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        }
        int[] answer = {nums[0], nums[1]};
        return answer;
    }

}
