package ClassWork.p170717.instruments;

public class Flute extends Wind {

    @Override
    protected void makeSound() {
        super.makeSound();
        System.out.println("Someone is playing Game of Thrones" +
                " theme with flute! I love it!");
    }

    @Override
    protected void showTubeSize() {
        System.out.println("It has small tube size");
    }
}
