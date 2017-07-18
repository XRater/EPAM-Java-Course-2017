package HomeWork.CodingBat.Arrays.Arrays2;

public class FizzArray3 {

    public int[] fizzArray3(int start, int end) {
        int[] answer = new int[end - start];
        for (int i = 0; i < end - start; i++)
            answer[i] = i + start;
        return answer;
    }

}
