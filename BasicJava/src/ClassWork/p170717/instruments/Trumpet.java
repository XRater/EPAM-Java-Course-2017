package ClassWork.p170717.instruments;

public class Trumpet extends Wind {

    @Override
    protected void makeSound() {
        super.makeSound();
        System.out.println("Uuuuuuu");
    }

    @Override
    protected void showTubeSize() {
        System.out.println("It is reaaaaly big");
    }
}
