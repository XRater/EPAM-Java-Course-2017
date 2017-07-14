package HomeWork.CodingBat.Arrays.Arrays1;

public class BiggestTwo {

    public int[] biggerTwo(int[] a, int[] b) {
        return (b[0] + b[1] > a[0] + a[1]) ? b : a;
    }

}
