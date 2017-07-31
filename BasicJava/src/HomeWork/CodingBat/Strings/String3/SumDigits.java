package HomeWork.CodingBat.Strings.String3;

class SumDigits {

    public int sumDigits(String str) {
        int s = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                s += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return s;
    }

}
