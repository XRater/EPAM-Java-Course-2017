package HomeWork.CodingBat.Arrays.Arrays2;

public class CenteredAverage {

    public int centeredAverage(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int s = 0;
        for (int val : nums) {
            if (val < min)
                min = val;
            if (val > max)
                max = val;
            s += val;
        }
        return (s - min - max) / (nums.length - 2);
    }

}
