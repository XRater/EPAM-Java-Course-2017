package ClassWork.p140717.inheritance2;

public class Dog extends Pet {

    @Override
    final protected void makeSound() {
        System.out.println("bark");
    }

    @Override
    protected void eat() {
        System.out.println("eat fast and eager");
    }
}
