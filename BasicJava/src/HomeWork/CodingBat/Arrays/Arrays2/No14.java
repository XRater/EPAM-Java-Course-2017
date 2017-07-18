package HomeWork.CodingBat.Arrays.Arrays2;

public class No14 {

    public boolean no14(int[] nums) {
        boolean no4 = true;
        boolean no1 = true;
        for (int value : nums) {
            if (value == 1)
                no1 = false;
            if (value == 4)
                no4 = false;
        }
        return no1 || no4;
    }

}
