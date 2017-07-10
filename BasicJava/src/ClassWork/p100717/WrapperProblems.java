package ClassWork.p100717;

import java.util.ArrayList;
import java.util.List;

public class WrapperProblems {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(0);
        list.add(null);

        int x = list.remove(0);
        System.out.println(x);
        System.out.println(list.remove(0));
        Integer y = list.remove(0);

//        System.out.println(new Integer(1).getClass());
        System.out.println(Integer.class);
        System.out.println(String.class);
    }

}
