package HomeWork.CodingBat.Strings.String3;

class SameEnds {

    public String sameEnds(String string) {
        int l = string.length();
        int k = l / 2;
        while (k >= 0 && !(string.substring(0, k)).equals(string.substring(l - k, l))) {
            k--;
        }
        return string.substring(0, k);
    }

}
