package HomeWork.CodingBat.Strings.String1;

class FirstTwo {

    public String firstTwo(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str.substring(0, 2);
    }

}
