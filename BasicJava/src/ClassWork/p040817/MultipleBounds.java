package ClassWork.p040817;

class MultipleBounds {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        process(a);
        process(b);
    }

    private static <T extends X & Y> void process(T t) {
        t.x();
        t.y();
    }

}

interface X {
    void x();
}

interface Y {
    void y();
}

class A implements X, Y {
    @Override
    public void x() {

    }

    @Override
    public void y() {

    }
}

class B implements X, Y {
    @Override
    public void x() {

    }

    @Override
    public void y() {

    }
}
