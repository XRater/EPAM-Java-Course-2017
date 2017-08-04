package HomeWork.CodingBat.Strings.String1;

class FrontAgain {

    public boolean frontAgain(String str) {
        return str.length() >= 2 &&
                str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()));
    }

}
