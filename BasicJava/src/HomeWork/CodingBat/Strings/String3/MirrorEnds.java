package HomeWork.CodingBat.Strings.String3;

class MirrorEnds {

    public String mirrorEnds(String string) {
        StringBuilder s = new StringBuilder();
        int i = 0;
        while (i < string.length() && string.charAt(i) == string.charAt(string.length() - i - 1)) {
            s.append(string.charAt(i++));
        }
        return s.toString();
    }

}
