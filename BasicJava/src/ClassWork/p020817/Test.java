package ClassWork.p020817;

class Test {

    public static void think() throws Exception {
        try {
            throw new Exception();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        think();
    }

}
