package HomeWork.CodingBat.Strings.String2;

class ZipZap {

    public String zipZap(String str) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' && (i + 2 < str.length() && str.charAt(i + 2) == 'p')) {
                s.append("zp");
                i += 2;
            } else {
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }

}
