package HomeWork.CodingBat.Warmup;

class Max1020 {

    public int max1020(int a, int b) {
        if (a >= 10 && a <= 20) {
            if (a > b || b > 20) {
                return a;
            }
        }
        return b >= 10 && b <= 20 ? b : 0;
    }

}
