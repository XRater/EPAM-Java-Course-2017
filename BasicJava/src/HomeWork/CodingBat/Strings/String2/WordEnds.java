package HomeWork.CodingBat.Strings.String2;

class WordEnds {

    public String wordEnds(String str, String word) {
        int n = word.length();
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(word, i) == i) {
                if (i != 0) {
                    s.append(str.charAt(i - 1));
                }
                if (i + n != str.length()) {
                    s.append(str.charAt(i + n));
                }
            }
        }
        return s.toString();
    }

}
