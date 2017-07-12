package p110717;

import utlis.Utils;

public class WaitNotifyProblems {

    public static void main(String[] args) {

        System.out.println("start");

        Object pager = new Object();

        new Thread(()-> {
           synchronized (pager) {
               try {
                   pager.wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
            System.out.println("huuray!");
        }).start();

        Utils.pause(1000);

        synchronized (pager) {
            pager.notify();
        }
    }

}
