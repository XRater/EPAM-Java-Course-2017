package ClassWork.p100717;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        List<String> list2 = new LinkedList<>();

        process_list(list);
        process_list(list2);
    }

    private static void process_list(List<String> list) {
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("x");

        String removed = list.remove(1);

        list.add(removed);

        System.out.println(list);
    }

}
