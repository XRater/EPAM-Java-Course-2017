package ClassWork.p190717.interfaces;

class Drum extends Instrument {


    @Override
    public void clean() {
        System.out.println(this.getClass());
    }
}
