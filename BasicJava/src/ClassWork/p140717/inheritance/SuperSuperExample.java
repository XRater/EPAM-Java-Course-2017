package ClassWork.p140717.inheritance;

public class SuperSuperExample {

    static class A {
        void m() {
            System.out.println("one");
        }
    }

    static class B extends A {
        @Override
        void m() {
            System.out.println("two");
        }

        protected void x() {
            super.m();
        }
    }

    static class C extends B {
    }

    public static void main(String[] args) {
        C c = new C();
        c.m();

        A a = (A)c;

        a.m();
    }
}
