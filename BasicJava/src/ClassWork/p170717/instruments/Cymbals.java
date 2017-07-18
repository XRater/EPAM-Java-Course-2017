package ClassWork.p170717.instruments;

public class Cymbals extends Drums {

    @Override
    protected void makeSound() {
        super.makeSound();
        System.out.println("Dzin-dzin-dzin");
    }

    @Override
    protected void showName() {
        System.out.println("Drums");
    }
}
