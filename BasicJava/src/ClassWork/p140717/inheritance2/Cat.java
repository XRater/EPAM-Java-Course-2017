package ClassWork.p140717.inheritance2;

public class Cat extends Pet {

    @Override
    protected void eat() {
        System.out.println("eat slowly");
    }

    @Override
    protected void makeSound() {
        System.out.println("mur");
    }
}
