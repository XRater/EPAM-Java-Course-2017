package HomeWork.CodingBat.Strings.String2;

class StarOut {

    public String starOut(String str) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                continue;
            }
            if (i != 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            if (i != str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            }
            s.append(str.charAt(i));
        }
        return s.toString();
    }

}
