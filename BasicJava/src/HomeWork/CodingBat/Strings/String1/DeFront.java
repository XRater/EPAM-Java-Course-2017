package HomeWork.CodingBat.Strings.String1;

class DeFront {

    public String deFront(String str) {
        if (str.length() == 0) {
            return str;
        }
        String s = "";
        s += str.charAt(0) == 'a' ? "a" : "";
        if (str.length() >= 2) {
            s += str.charAt(1) == 'b' ? "b" : "";
        }
        return str.length() == 1 ? s : s + str.substring(2, str.length());
    }

}
