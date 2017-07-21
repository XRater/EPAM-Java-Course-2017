package HomeWork.CodingBat.Strings.String3;

class EquallsNot {

    public boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;
        int index = str.indexOf("is");
        while (index != -1) {
            is++;
            index = str.indexOf("is", index + 1);
        }
        index = str.indexOf("not");
        while (index != -1) {
            not++;
            index = str.indexOf("not", index + 1);
        }
        return is == not;
    }

}
