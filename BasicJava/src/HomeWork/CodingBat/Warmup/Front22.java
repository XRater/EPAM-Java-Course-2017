package HomeWork.CodingBat.Warmup;

class Front22 {

    public String front22(String str) {
        String s = str.length() >= 2 ? str.substring(0, 2) : str;
        return s + str + s;
    }

}
