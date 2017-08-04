package HomeWork.CodingBat.Strings.String1;

class LastTwo {

    public String lastTwo(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }

}
