package HomeWork.CodingBat.Strings.String2;

class DoubleChar {

    public String doubleChar(String str) {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            s.append(str.charAt(i) + str.charAt(i));
        }
        return s.toString();
    }

}
