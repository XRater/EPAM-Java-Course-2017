package ClassWork.p140717.hiding;

public class HidingExample {

    public static void main(String[] args) {

        First.X();
        Second.makeSomethingCool();

        First f = new Second();
        First.X();
    }

}
