package ClassWork.p020817.generics.interface_adopting;

class MoreGenericMethodsExamples {

    public static void main(String[] args) {

        Example.staticMethod(1);
        Example.staticMethod("one");
        Example.staticMethod(new Object());

        Example<String> ex1 = new Example<>();
        Example<Integer> ex2 = new Example<>();

        ex1.instanceMethod(1);
        ex1.instanceMethod("one");
        ex1.instanceMethod(new Object());

        Example.staticMethod(ex1);
        Example.staticMethod(ex2);
    }

}


class Example<T> {

    static public <M> void staticMethod(M m) {
        System.out.println(m.getClass());
    }

    public <M> void instanceMethod(M m) {
        System.out.println(m);
    }

}