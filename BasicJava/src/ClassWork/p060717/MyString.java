package ClassWork.p060717;

public class MyString {

    private final char[] value;

    public MyString(String valueSource) {
        value = valueSource.toCharArray();
    }

    public char[] toCharArray() {
        return value;
    }

    @Override
    public String toString() {
        return new String(value);
    }

    public static void main(String[] args) {

        MyString s = new MyString("hello");

        String s1 = "hello";
        s.value[0] = 'b';
//        s.value[0] = 'b';
        //        s.toCharArray()[0] = 'b';

        System.out.println(s1);
    }

}
