package HomeWork.CodingBat.Arrays.Arrays2;

public class More14 {

    public boolean more14(int[] nums) {
        int a = 0, b = 0;
        for (int num : nums) {
            if (num == 1)
                a++;
            if (num == 4)
                b++;
        }
        return a > b;
    }

}
