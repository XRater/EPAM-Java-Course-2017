package ClassWork.p020817.generics;

import java.util.ArrayList;
import java.util.List;

class PreGenericExamples {

    public static void main(String[] args) {

        List strings = new ArrayList();

        strings.add("one");
        strings.add(1);

        printLengths(strings);
    }

    private static void printLengths(List strings) {
        for (Object o : strings) {
            if (o instanceof String) {
                String s = (String) o;
                System.out.println(s.length());
            }
        }
    }

}
