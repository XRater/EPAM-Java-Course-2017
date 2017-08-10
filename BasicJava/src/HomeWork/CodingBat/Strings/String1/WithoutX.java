package HomeWork.CodingBat.Strings.String1;

class WithoutX {

    public String withoutX(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            str = str.substring(1, str.length());
        }
        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

}
