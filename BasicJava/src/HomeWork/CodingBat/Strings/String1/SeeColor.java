package HomeWork.CodingBat.Strings.String1;

class SeeColor {

    public String seeColor(String str) {
        if (str.indexOf("red") == 0) {
            return "red";
        }
        return str.indexOf("blue") == 0 ? "blue" : "";
    }

}
