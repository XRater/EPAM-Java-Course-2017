package HomeWork.CodingBat.Arrays.Arrays2;

public class CountEvents {

    public int countEvens(int[] nums) {
        int ans = 0;
        for (int num : nums)
            if (num % 2 == 0)
                ans++;
        return ans;
    }

}
