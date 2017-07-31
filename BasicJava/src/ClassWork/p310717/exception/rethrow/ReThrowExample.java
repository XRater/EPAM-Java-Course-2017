package ClassWork.p310717.exception.rethrow;

class ReThrowExample {

    public static void main(String[] args) {

        buildHouse();

    }

    private static void buildHouse() {

        buildBasement();

    }

    private static void buildBasement() {

        try {
            digPit();
        } catch (Exception e) {
            throw new NoInstruments(e);
        }

    }

    private static void digPit() {

        throw new NoShovel();

    }

}
