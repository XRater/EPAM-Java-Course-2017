package HomeWork.CodingBat.Warmup;

class DelDel {

    public String delDel(String str) {
        return str.indexOf("del") == 1 ? str.charAt(0) + str.substring(4, str.length()) : str;
    }

}
