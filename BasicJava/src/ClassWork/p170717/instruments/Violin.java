package ClassWork.p170717.instruments;

public class Violin extends Bowed{

    @Override
    protected void makeSound() {
        super.makeSound();
        System.out.println("Playing \"summer\" of Vivaldi");
    }

    @Override
    protected void showType() {
        System.out.println("Violin");
    }

    @Override
    protected void showStringNumber() {
        System.out.println("Violin has 4 strings");
    }
}
