package ClassWork.exercises.song_test;

class Use {

    public static void foo(A a) {
        System.out.println(1);
    }

    public static void foo(B b) {
        System.out.println(2);
    }

    public static void bar(X x) {

    }

    public static void bar(Y y) {

    }

    public static void main(String[] args) {

        A a = new B();

        foo(a);

        C c = new C();

//        bar(c);
    }

}
