package HomeWork.CodingBat.Strings.String2;

class XyzThere {

    public boolean xyzThere(String str) {
        int index = str.indexOf("xyz");
        while (index != -1) {
            if (index - 1 < 0 || str.charAt(index - 1) != '.') {
                return true;
            }
            index = str.indexOf("xyz", index + 1);
        }
        return false;
    }

}
