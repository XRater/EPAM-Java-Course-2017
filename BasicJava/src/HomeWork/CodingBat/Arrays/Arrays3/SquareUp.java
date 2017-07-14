package HomeWork.CodingBat.Arrays.Arrays3;

public class SquareUp {

    public int[] squareUp(int n) {
        int[] res = new int[n * n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                res[n * i + j] = (i + j >= n - 1) ? n - j : 0;
        return res;
    }

}
