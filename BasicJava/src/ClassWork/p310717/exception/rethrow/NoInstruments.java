package ClassWork.p310717.exception.rethrow;

class NoInstruments extends RuntimeException {

    public NoInstruments(Exception cause) {
        super(cause);
    }
}
