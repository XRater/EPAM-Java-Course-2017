package HomeWork.CodingBat.Arrays.Arrays2;

public class Only14 {

    public boolean only14(int[] nums) {
        boolean answer = true;
        for (int value : nums) {
            if (value != 1 && value != 4)
                answer = false;
        }
        return answer;
    }

}
