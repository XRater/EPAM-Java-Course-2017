package HomeWork.CodingBat.Strings.String1;

class ConCat {

    public String conCat(String a, String b) {
        if (a.length() == 0) {
            return b;
        }
        if (b.length() == 0) {
            return a;
        }
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a.substring(0, a.length() - 1) + b;
        }
        return a + b;
    }

}
