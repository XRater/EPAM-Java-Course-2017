package HomeWork.CodingBat.Strings.String2;

class RepeatFront {

    public String repeatFront(String str, int n) {
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans += str.substring(0, n - i);
        }
        return ans;
    }

}
