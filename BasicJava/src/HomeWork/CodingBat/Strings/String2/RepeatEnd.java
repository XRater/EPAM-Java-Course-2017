package HomeWork.CodingBat.Strings.String2;

class RepeatEnd {

    public String repeatEnd(String str, int n) {
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans += str.substring(str.length() - n, str.length());
        }
        return ans;
    }

}
