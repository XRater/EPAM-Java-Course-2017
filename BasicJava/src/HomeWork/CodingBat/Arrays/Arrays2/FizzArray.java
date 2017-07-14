package HomeWork.CodingBat.Arrays.Arrays2;

public class FizzArray {

    public int[] fizzArray(int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n; i++)
            ans[i] = i;
        return ans;
    }

}
