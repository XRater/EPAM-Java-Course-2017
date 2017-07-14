package ClassWork.p140717.inheritance2;

public abstract class Pet extends Mammal {

//    final protected String name;

    public void feed() {
        makeSound();
        eat();
    }

    abstract protected void eat();
    protected void makeSound() {
        System.out.println("hhhhh");
    };

}
