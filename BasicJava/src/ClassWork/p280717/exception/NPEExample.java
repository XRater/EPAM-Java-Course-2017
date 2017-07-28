package ClassWork.p280717.exception;

class NPEExample {

    public static void main(String[] args) {

        printObjectInfo("hello");

        printObjectInfo(null);

    }

    private static void printObjectInfo(Object o) {

        if (o == null) {
            return;
        }

        System.out.println("Class name " + o.getClass().getCanonicalName());
        System.out.println("Class hash " + o.hashCode());
        System.out.println("Class string " + o.toString());

    }

}
