package HomeWork.CodingBat.Arrays.Arrays2;

public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {
        String[] answer = new String[end - start];
        for (int value = start; value < end; value++) {
            if (value % 3 == 0 && value % 5 == 0)
                answer[value - start] = "FizzBuzz";
            else if (value % 3 == 0)
                answer[value - start] = "Fizz";
            else if (value % 5 == 0)
                answer[value - start] = "Buzz";
            else
                answer[value - start] = new Integer(value).toString();
        }
        return answer;
    }

}
