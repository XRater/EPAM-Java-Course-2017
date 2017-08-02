package ClassWork.p020817.generics.Cleaning;

import java.util.Arrays;
import java.util.List;

class CleanExample {

    public static void main(String[] args) {

        List<Furniture> furniture = Arrays.asList(new Chair(), new Table());

        CleaningBot<Furniture> cleaner = new CleaningBot<>();
        for (Furniture f : furniture) {
            cleaner.clean(f);
        }
    }

}


abstract class Furniture {

}

class Chair extends Furniture {

}

class Table extends Furniture {

}

class CleaningBot<T> implements Cleaning<T> {
    @Override
    public void clean(T t) {

    }
}

interface Cleaning<T> {
    void clean(T t);
}

