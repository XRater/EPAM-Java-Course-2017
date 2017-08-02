package HomeWork.CodingBat.Strings.String3;

class MaxBlock {

    public int maxBlock(String str) {
        int max = 0;
        int cur = 0;
        int index = 0;
        char c = 'a';
        while (index < str.length()) {
            if (cur == 0) {
                c = str.charAt(index);
            }
            if (str.charAt(index) == c) {
                cur++;
            } else {
                cur = 1;
                c = str.charAt(index);
            }
            max = Math.max(cur, max);
            index++;
        }
        return max;
    }

}
