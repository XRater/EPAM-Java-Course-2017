package ClassWork.p170717.instruments;

public abstract class Drums extends MusicalInstrument {

    @Override
    protected void makeSound() {
        System.out.println("Hmmm, seems that someone playing Drums");
    }

    @Override
    public void showInfo() {
        showName();
    }

    protected abstract void showName();
}
