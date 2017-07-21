package ClassWork.p190717.vehiles;

public class Car extends Automobile {

    private static final int STANDARD_SPEED = 150;
    private static final int STANDARD_SEATS_NUMBER = 4;

    final Object[] seats;

    public Car() {
        seats = new Object[STANDARD_SEATS_NUMBER];
    }

    public Car(int seatsNumber) {
        seats = new Object[seatsNumber];
    }

    public int getSpeed() {
        return STANDARD_SPEED;
    }
}
