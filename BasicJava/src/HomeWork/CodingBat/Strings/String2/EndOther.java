package HomeWork.CodingBat.Strings.String2;

class EndOther {

    public boolean endOther(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();
        return a.endsWith(b) || b.endsWith(a);
    }

}
