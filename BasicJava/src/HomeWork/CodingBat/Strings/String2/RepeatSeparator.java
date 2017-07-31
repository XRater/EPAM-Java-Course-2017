package HomeWork.CodingBat.Strings.String2;

class RepeatSeparator {

    public String repeatSeparator(String word, String sep, int count) {
        String ans = "";
        for (int i = 0; i < count - 1; i++) {
            ans += (word + sep);
        }
        return count == 0 ? "" : ans + word;
    }

}
