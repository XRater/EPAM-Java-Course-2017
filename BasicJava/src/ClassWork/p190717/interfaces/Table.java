package ClassWork.p190717.interfaces;

class Table extends Furniture {

    @Override
    public void clean() {
        System.out.println(this.getClass());
    }
}
