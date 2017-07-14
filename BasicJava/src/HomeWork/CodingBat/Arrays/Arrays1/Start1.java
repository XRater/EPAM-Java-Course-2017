package HomeWork.CodingBat.Arrays.Arrays1;

public class Start1 {

    public int start1(int[] a, int[] b) {
        int answer = 0;
        if (a.length > 0 && a[0] == 1)
            answer++;
        if (b.length > 0 && b[0] == 1)
            answer++;
        return answer;
    }

}
