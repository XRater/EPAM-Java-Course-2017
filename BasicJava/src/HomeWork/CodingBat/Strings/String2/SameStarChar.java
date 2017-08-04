package HomeWork.CodingBat.Strings.String2;

class SameStarChar {

    public boolean sameStarChar(String str) {
        boolean ans = true;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                ans &= str.charAt(i + 1) == str.charAt(i - 1);
            }
        }
        return ans;
    }

}
