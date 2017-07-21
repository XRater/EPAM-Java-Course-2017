package HomeWork.CodingBat.Strings.String2;

class CountHi {

    public static void main(String[] args) {
        String s = "hihi";
        System.out.println(s.indexOf("hi"));
        System.out.println(s.indexOf("hi", 3));
    }

    public int countHi(String str) {
        int cnt = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == 'h' && str.charAt(i) == 'i') {
                cnt++;
            }
        }
        return cnt;
    }
}
