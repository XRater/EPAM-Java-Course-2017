package HomeWork.CodingBat.Strings.String2;

class RepeatEnd {

    public String repeatEnd(String str, int n) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            ans.append(str.substring(str.length() - n, str.length()));
        }
        return ans.toString();
    }

}
