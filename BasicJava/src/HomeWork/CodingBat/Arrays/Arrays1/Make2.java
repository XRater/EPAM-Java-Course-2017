package HomeWork.CodingBat.Arrays.Arrays1;

class Make2 {

    public int[] make2(int[] a, int[] b) {
        int[] answer = new int[2];
        if (a.length == 0) {
            answer[0] = b[0];
            answer[1] = b[1];
            return answer;
        }
        if (a.length == 1) {
            answer[0] = a[0];
            answer[1] = b[0];
            return answer;
        }
        answer[0] = a[0];
        answer[1] = a[1];
        return answer;
    }

}
