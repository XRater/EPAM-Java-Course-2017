package HomeWork.CodingBat.Strings.String1;

class ExtraFront {

    public String extraFront(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str.substring(0, 1) + str.substring(0, 1) + str.substring(0, 1);
        }
        return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }

}
