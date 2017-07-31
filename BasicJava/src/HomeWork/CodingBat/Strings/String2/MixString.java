package HomeWork.CodingBat.Strings.String2;

class MixString {

    // would be much better to use StringBuilder/StringBuffer
    public String mixString(String a, String b) {
        String c = "";
        int i = 0, j = 0;
        while (i != a.length() || j != b.length()) {
            if (i != a.length()) {
                c += a.charAt(i++);
            }
            if (j != b.length()) {
                c += b.charAt(j++);
            }
        }
        return c;
    }

}
