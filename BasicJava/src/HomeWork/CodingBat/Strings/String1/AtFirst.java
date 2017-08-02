package HomeWork.CodingBat.Strings.String1;

class AtFirst {

    public String atFirst(String str) {
        int n = str.length();
        if (n == 0) {
            return "@@";
        }
        return n >= 2 ? str.substring(0, 2) : str + "@";
    }

}
