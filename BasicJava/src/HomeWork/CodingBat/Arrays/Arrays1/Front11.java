package HomeWork.CodingBat.Arrays.Arrays1;

class Front11 {

    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return a;
        }
        if (a.length >= 1 && b.length == 0) {
            int[] answer = {a[0]};
            return answer;
        }
        if (a.length == 0 && b.length >= 1) {
            int[] answer = {b[0]};
            return answer;
        }
        int[] answer = {a[0], b[0]};
        return answer;
    }

}
