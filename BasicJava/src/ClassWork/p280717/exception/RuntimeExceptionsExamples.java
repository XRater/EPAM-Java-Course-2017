package ClassWork.p280717.exception;

class RuntimeExceptionsExamples {


    public static void main(String[] args) {

        cast();

    }

    private static void cast() {

        Object o = "hello";

        o = new StringBuffer();

        String string = castToString(o);
    }

    private static String castToString(Object o) {
        String s;
        try {
            s = (String) o;
        } catch (Exception e) {
            s = "";
        }
        return s;
    }


}
