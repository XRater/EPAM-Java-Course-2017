package HomeWork.CodingBat.Strings.String2;

class PlusOut {

    public String plusOut(String str, String word) {
        int n = word.length();
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(word, i) == i) {
                s.append(word);
                i += n - 1;
                continue;
            }
            s.append('+');
        }
        return s.toString();
    }

}
