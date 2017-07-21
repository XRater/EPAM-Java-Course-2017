package ClassWork.p190717.vehiles;

public class Automobile extends Vehile {

    @Override
    public void move(int x, int y) {
        System.out.println("moves to" + x + ", " + y);
    }
}
