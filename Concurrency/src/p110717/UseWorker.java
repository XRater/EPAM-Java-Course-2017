package p110717;

public class UseWorker {

    public static void main(String[] args) {

        SimpleWorker worker = new SimpleWorker();

        worker.process(()-> {
            System.out.println("You did it first time!");
        });

        worker.process(()-> {
            System.out.println("You did it second time!");
        });

        worker.process(()-> {
            System.out.println("You did it third time!");
        });
    }

}
