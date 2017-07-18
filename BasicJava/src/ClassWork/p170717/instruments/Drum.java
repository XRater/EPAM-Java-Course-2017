package ClassWork.p170717.instruments;

public class Drum extends Drums {

    @Override
    protected void makeSound() {
        super.makeSound();
        System.out.println("Bom-boom-bom");
    }

    @Override
    protected void showName() {
        System.out.println("Drum");
    }
}
