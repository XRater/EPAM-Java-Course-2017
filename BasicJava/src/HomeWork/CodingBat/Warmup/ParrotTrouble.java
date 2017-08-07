package HomeWork.CodingBat.Warmup;

class ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour > 20 || hour < 7);
    }

}
