package HomeWork.CodingBat.Warmup;

class EveryNth {

    public String everyNth(String str, int n) {
        StringBuilder s = new StringBuilder();
        int index = 0;
        while (index < str.length()) {
            s.append(str.charAt(index));
            index += n;
        }
        return s.toString();
    }

}
