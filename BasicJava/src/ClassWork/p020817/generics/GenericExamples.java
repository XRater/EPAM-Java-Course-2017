package ClassWork.p020817.generics;

import java.util.ArrayList;
import java.util.List;

class GenericExamples {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
//        list.add(1);

        printStringLength(list);
    }

    private static void printStringLength(List<String> list) {
        for (String s : list) {
            System.out.println(s.length());
        }
    }

}
