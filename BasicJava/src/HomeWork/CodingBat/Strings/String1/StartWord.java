package HomeWork.CodingBat.Strings.String1;

class StartWord {

    public String startWord(String str, String word) {
        if (str.indexOf(word.substring(1, word.length()), 1) == 1) {
            return str.substring(0, word.length());
        }
        return "";
    }

}
