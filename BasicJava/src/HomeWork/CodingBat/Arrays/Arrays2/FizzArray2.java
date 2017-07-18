package HomeWork.CodingBat.Arrays.Arrays2;

public class FizzArray2 {

    public String[] fizzArray2(int n) {
        String[] ans = new String[n];
        for (int i = 0; i < n; i++)
            ans[i] = Integer.toString(i);
        return ans;
    }

}
