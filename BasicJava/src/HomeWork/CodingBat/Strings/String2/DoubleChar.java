package HomeWork.CodingBat.Strings.String2;

class DoubleChar {

    public String doubleChar(String str) {
        String s = new String();
        for (int i = 0; i < str.length(); i++) {
            s = s + str.charAt(i) + str.charAt(i);
        }
        return s;
    }

}
