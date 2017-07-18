package HomeWork.CodingBat.Arrays.Arrays2;

public class WithoutTen {

    public int[] withoutTen(int[] nums) {
        int[] answer = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num != 10)
                answer[index++] = num;
        }
        return answer;
    }

}
