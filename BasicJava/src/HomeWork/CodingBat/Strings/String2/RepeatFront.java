package HomeWork.CodingBat.Strings.String2;

class RepeatFront {

    public String repeatFront(String str, int n) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            ans.append(str.substring(0, n - i));
        }
        return ans.toString();
    }

}
