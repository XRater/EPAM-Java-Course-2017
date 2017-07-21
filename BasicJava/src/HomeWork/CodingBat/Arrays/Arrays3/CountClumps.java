package HomeWork.CodingBat.Arrays.Arrays3;

class CountClumps {

    public int countClumps(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int cnt = 0;
        int last = nums[0];
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == last) {
                k++;
            } else {
                last = nums[i];
                if (k > 1) {
                    cnt++;
                }
                k = 1;
            }
        }
        if (k > 1) {
            cnt++;
        }
        return cnt;
    }

}
