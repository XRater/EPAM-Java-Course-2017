package HomeWork.CodingBat.Arrays.Arrays2;

public class Sum67 {

    public int sum67(int[] nums) {
        int mode = 1;
        int s = 0;
        for (int num : nums) {
            if (num == 6)
                mode = 2;
            if (mode == 1)
                s += num;
            if (num == 7)
                mode = 1;
        }
        return s;
    }

}
