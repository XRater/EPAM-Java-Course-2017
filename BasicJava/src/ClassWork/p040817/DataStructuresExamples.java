package ClassWork.p040817;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class DataStructuresExamples {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(1);

        ArrayList<String> names = new ArrayList<>();

        names.add("sdf");
        Arrays.sort(new ArrayList[]{names});

        System.out.println(names.get(0));
    }

}
