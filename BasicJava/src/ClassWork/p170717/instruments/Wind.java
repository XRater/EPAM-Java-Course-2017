package ClassWork.p170717.instruments;

public abstract class Wind extends MusicalInstrument {

    @Override
    protected void makeSound() {
        System.out.println("I hear sounds of wind instrument...");
    }

    @Override
    public void showInfo() {
        showTubeSize();
    }

    protected abstract void showTubeSize();

}
