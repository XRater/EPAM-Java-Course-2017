package HomeWork.CodingBat.Strings.String1;

class LastChars {

    public String lastChars(String a, String b) {
        String s = "";
        s += a.length() != 0 ? a.charAt(0) : '@';
        s += b.length() != 0 ? b.charAt(b.length() - 1) : '@';
        return s;
    }

}
