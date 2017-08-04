package ClassWork.exercises;

class Song {

    public static void main(String[] dribble) {
        try {
            throw new Exception();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.print(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
