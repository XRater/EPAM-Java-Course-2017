package ClassWork.p310717.exception.overriding;

class A {

    void m() throws MyException {
    }

    static void foo() {
        System.out.println(0);
    }

    static void foo(int a) {
        System.out.println(1);
    }

    static void foo(int... a) {
        System.out.println(2);
    }

    public static void main(String[] args) {
        foo(1, 2, 3, 4, 5);
    }
}
