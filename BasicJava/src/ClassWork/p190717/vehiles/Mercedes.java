package ClassWork.p190717.vehiles;

public class Mercedes extends Car {

    public Mercedes() {
        super();
    }

    public Mercedes(int seats) {
        super(seats);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + 50;
    }
}
