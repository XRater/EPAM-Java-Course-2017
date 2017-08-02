package HomeWork.CodingBat.Strings.String2;

class XyzMiddle {

    public boolean xyzMiddle(String str) {
        int n = str.length();
        if (n <= 2) {
            return false;
        }
        if (str.substring(n / 2 - 1, n / 2 + 2).equals("xyz")) {
            return true;
        }
        return n % 2 != 1 && str.substring(n / 2 - 2, n / 2 + 1).equals("xyz");
    }

}
