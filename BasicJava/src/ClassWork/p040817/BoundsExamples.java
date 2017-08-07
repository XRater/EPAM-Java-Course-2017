package ClassWork.p040817;

class BoundsExample {

    public static void main(String[] args) {

        double result = min(1.6, 3.0);

        System.out.println(result);
    }
    
    private static <T extends Comparable<T>> T min(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }

}
