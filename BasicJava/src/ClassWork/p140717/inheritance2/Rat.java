package ClassWork.p140717.inheritance2;

public class Rat extends Rodent {

    @Override
    protected void eat() {
        System.out.println("grub-n-run");
    }

    @Override
    protected void makeSound() {
        teethClac();
        super.makeSound();
        teethClac();
    }

    private void teethClac() {
        System.out.println("clac-clac");
    }
}
