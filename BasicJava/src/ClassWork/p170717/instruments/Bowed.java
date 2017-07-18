package ClassWork.p170717.instruments;

abstract class Bowed extends Stringed{

    @Override
    public void showInfo() {
        super.showInfo();
        showType();
    }

    @Override
    protected void makeSound() {
        System.out.println("Beautiful sound of stringed instrument... Somewhere in concert hall");
    }

    protected abstract void showType();

}
