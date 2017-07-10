package ClassWork.p070717;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println(list);

        List<String> unmodifiableList = Collections.unmodifiableList(list);

        unmodifiableList.set(0, "change");
    }

}
