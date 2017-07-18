package ClassWork.p170717.instruments;

public class Contrabass extends Bowed {

    @Override
    protected void makeSound() {
        super.makeSound();
        System.out.println("It sounds in low tone...");
    }

    @Override
    protected void showStringNumber() {
        System.out.println("4 or sometimes 3/5 strings");
    }

    @Override
    protected void showType() {
        System.out.println("Contrabass");
    }
}
