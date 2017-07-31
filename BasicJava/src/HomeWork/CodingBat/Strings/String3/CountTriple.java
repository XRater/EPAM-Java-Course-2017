package HomeWork.CodingBat.Strings.String3;

class CountTriple {

    public int countTriple(String str) {
        int count = 0;
        for (int i = 2; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1) && str.charAt(i) == str.charAt(i - 2)) {
                count++;
            }
        }
        return count;
    }

}
