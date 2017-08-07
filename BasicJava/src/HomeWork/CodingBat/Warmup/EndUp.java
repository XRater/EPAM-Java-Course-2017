package HomeWork.CodingBat.Warmup;

class EndUp {

    public String endUp(String str) {
        int n = Math.max(0, str.length() - 3);
        return str.substring(0, n) + str.substring(n, str.length()).toUpperCase();
    }

}
