package ClassWork.p070717;

import java.util.ArrayList;

public class ArrayListExamples {

    static ArrayList<String> listOfStrings = new ArrayList<>();

    public static void main(String[] args) {

        listOfStrings.add("one");
        listOfStrings.add("two");
        listOfStrings.add("two");
        listOfStrings.add("three");
        listOfStrings.add("four");

        System.out.println(listOfStrings.toString());
    }

}
