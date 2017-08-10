package HomeWork.CodingBat.Strings.String3;

class NotReplace {

    public String notReplace(String str) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            s.append(str.charAt(i));
            if (str.charAt(i) == 's') {
                if (i == 0) {
                    continue;
                }
                if (str.charAt(i - 1) != 'i') {
                    continue;
                }
                if (i != 1 && Character.isLetter(str.charAt(i - 2))) {
                    continue;
                }
                if (i != str.length() - 1 && Character.isLetter(str.charAt(i + 1))) {
                    continue;
                }
                s.append(" not");
            }
        }
        return s.toString();
    }

}
