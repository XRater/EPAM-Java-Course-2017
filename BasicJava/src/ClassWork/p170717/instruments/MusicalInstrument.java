package ClassWork.p170717.instruments;

abstract class MusicalInstrument {

    public void playInstrument() {
        makeSound();
    }

    public abstract void showInfo();

    protected abstract void makeSound();

}
