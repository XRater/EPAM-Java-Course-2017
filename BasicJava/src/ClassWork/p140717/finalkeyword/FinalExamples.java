package ClassWork.p140717.finalkeyword;

public class FinalExamples {

    public static void main(String[] args) {

        Integer x = 10;
        Integer y = 200;

//        process(x);
        swap(x, y);

        System.out.println(x);
        System.out.println(y);
    }

    private static void swap(Integer x, Integer y) {
        Integer tmp = x;
        x = y;
        y = tmp;
    }

    private static void process(int x) {
        x += 10;
    }

}
