package HomeWork.CodingBat.Strings.String2;

class PrefixAgain {

    public boolean prefixAgain(String str, int n) {
        String begin = str.substring(0, n);
        return str.substring(1, str.length()).contains(begin);
    }

}
