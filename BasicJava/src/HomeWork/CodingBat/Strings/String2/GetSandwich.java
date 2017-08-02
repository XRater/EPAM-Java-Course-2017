package HomeWork.CodingBat.Strings.String2;

class GetSandwich {

    public String getSandwich(String str) {
        int i = str.indexOf("bread");
        int j = str.lastIndexOf("bread");
        if (i == -1 || i == j) {
            return "";
        }
        return str.substring(i + 5, j);
    }

}
