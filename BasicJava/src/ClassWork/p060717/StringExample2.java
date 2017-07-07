package ClassWork.p060717;

public class StringExample2 {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = new String(s1);
        String s3 = s1;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

    }

}
