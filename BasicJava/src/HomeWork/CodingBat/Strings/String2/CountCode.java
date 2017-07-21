package HomeWork.CodingBat.Strings.String2;

class CountCode {

    public int countCode(String str) {
        int cnt = 0;
        int index = str.indexOf("co");
        while (index != -1) {
            if (index + 3 < str.length() && str.charAt(index + 3) == 'e') {
                cnt++;
            }
            index = str.indexOf("co", index + 1);
        }
        return cnt;
    }

}
