package ClassWork.p140717.inheritance2;

import java.util.Arrays;
import java.util.List;

public class HomeBot {

    public static void main(String[] args) {

        List<Pet> pets = Arrays.asList(new Dog(), new Cat(), new Hamster(), new Rat());

        for (Pet pet : pets) {
//            System.out.println("Feeding");
            System.out.println();
            pet.feed();
        }

    }

}
