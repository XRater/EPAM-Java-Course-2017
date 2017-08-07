package HomeWork.CodingBat.Warmup;

class Close10 {

    public int close10(int a, int b) {
        int d1 = Math.abs(a - 10);
        int d2 = Math.abs(b - 10);
        return d1 == d2 ? 0 : (d1 < d2 ? a : b);
    }

}
