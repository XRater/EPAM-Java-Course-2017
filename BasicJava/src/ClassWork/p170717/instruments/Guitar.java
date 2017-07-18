package ClassWork.p170717.instruments;

public class Guitar extends Stringed{


    @Override
    protected void showStringNumber() {
        System.out.println("Guitar has 4 strings");
    }

    @Override
    protected void makeSound() {
        System.out.println("Guitar songs near fire... I love it!");
    }
}
