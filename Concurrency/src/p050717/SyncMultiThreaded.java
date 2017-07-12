package p050717;

import utlis.Utils;

public class SyncMultiThreaded {

    synchronized void change() {

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            Utils.pause(1000);
        }

    }

    public static void main(String[] args) {

        Sync sync = new Sync();

        for (int i = 0; i < 10; i++)
            new Thread(sync::change).start();

        sync.change();
    }

}
