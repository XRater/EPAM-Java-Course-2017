package HomeWork.CodingBat.Arrays.Arrays2;

public class Lucky13 {

    public boolean lucky13(int[] nums) {
        boolean ans = true;
        for (int num : nums) {
            if (num == 3)
                return false;
            if (num == 1)
                ans = false;
        }
        return ans;
    }

}
