package ClassWork.p020817.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class GenericListHack {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        List l = list;

        l.add(1);

//        foo(list);
        // to prevent this

        List<String> strings = Collections.checkedList(new ArrayList<>(), String.class);

        List ls = strings;
        ls.add(1);
        foo(strings);
    }

    private static void foo(List<String> list) {
        for (String s : list) {
            System.out.println(s.length());
        }
    }

}
