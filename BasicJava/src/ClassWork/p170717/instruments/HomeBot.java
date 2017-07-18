package ClassWork.p170717.instruments;

import java.util.Arrays;
import java.util.List;

public class HomeBot {

    public static void main(String[] args) {

        List<MusicalInstrument> instruments = Arrays.asList(
                new Guitar(),
                new Trumpet(),
                new Violin(),
                new Cymbals(),
                new Drum(),
                new Flute(),
                new Contrabass()
        );

        for (MusicalInstrument instrumnet : instruments) {
            instrumnet.showInfo();
            instrumnet.playInstrument();
        }

    }

}
