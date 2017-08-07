package HomeWork.CodingBat.Warmup;

class BackAround {

    public String backAround(String str) {
        char c = str.charAt(str.length() - 1);
        return c + str + c;
    }

}
