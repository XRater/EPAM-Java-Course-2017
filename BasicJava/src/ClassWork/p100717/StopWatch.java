package ClassWork.p100717;

import java.time.Duration;
import java.time.Instant;

public class StopWatch {

    public static void main(String[] args) throws InterruptedException {

        Instant start = Instant.now();

        Instant stop = Instant.now();

        Duration elapsed = Duration.between(start, stop);

        System.out.println(elapsed.toMillis());

        long timer = System.nanoTime() - System.nanoTime();
        System.out.println(timer);
    }

}
