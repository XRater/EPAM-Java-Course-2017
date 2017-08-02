package HomeWork.CodingBat.Strings.String2;

class RepeatSeparator {

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < count - 1; i++) {
            ans.append(word).append(sep);
        }
        return count == 0 ? "" : ans + word;
    }

}
