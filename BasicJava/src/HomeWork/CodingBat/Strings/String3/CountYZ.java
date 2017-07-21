package HomeWork.CodingBat.Strings.String3;

class CountYZ {

    public int countYZ(String str) {
        int cnt = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if ((i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1)))
                    && (str.charAt(i) == 'y' || str.charAt(i) == 'z')) {
                cnt++;
            }
        }
        return cnt;
    }

}
