package HomeWork.CodingBat.Strings.String1;

class WithouEnd2 {

    public String withouEnd2(String str) {
        if (str.length() <= 1) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

}
