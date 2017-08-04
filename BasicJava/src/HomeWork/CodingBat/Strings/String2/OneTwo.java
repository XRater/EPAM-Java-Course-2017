package HomeWork.CodingBat.Strings.String2;

class OneTwo {

    public String oneTwo(String str) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i + 3 <= str.length(); i += 3) {
            s.append(str.charAt(i + 1));
            s.append(str.charAt(i + 2));
            s.append(str.charAt(i));
        }
        return s.toString();
    }

}
