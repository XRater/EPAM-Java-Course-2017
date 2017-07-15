package HomeWork.p070717;

public class StringMethods {

    static String trim(String s) {
        if (s == null || s.length() == 0)
            return s;
        if (s.indexOf(' ') == -1)
            return s;

        int begin = 0;
        int end = s.length() - 1;

        while (s.charAt(begin++) <= ' ') {}
        while (s.charAt(end--) <= ' ') {}

        return s.substring(begin - 1, end + 2);
    }

    public static String replace(String s, char c1, char c2) {
        if (s == null)
            return null;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c1)
                sb.append(c2);
            else
                sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
