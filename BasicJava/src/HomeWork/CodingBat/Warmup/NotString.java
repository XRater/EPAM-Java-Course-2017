package HomeWork.CodingBat.Warmup;

class NotString {

    public String notString(String str) {
        return str.startsWith("not") ? str : "not " + str;
    }

}
