package HomeWork.CodingBat.Strings.String1;

class WithoutX2 {

    public String withoutX2(String str) {
        if (str.length() == 0)
            return str;
        if (str.length() == 1)
            return str.charAt(0) == 'x' ? "" : str;
        if (str.charAt(0) == 'x') {
            if (str.charAt(1) == 'x')
                return str.substring(2, str.length());
            return str.substring(1, str.length());
        }
        if (str.charAt(1) == 'x')
            return str.charAt(0) + str.substring(2, str.length());
        return str;
    }

}
