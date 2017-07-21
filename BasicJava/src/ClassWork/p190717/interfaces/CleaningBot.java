package ClassWork.p190717.interfaces;

import java.util.Arrays;
import java.util.List;

class CleaningBot {

    public static void main(String[] args) {

        List<Cleanable> cleanables = Arrays.asList(
                new Chair(),
                new Table(),
                new Violin(),
                new Drum()
        );

        for (Cleanable cleanable : cleanables) {
            cleanable.clean();
        }
    }

}
