package ClassWork.p170717.instruments;

abstract class Stringed extends MusicalInstrument{

    public void showInfo() {
        showStringNumber();
    }

    protected abstract void showStringNumber();
}
