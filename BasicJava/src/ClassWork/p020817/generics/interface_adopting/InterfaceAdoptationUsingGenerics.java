package ClassWork.p020817.generics.interface_adopting;

class InterfaceAdoptationUsingGenerics {

    public static void main(String[] args) {

        Makeable<D> m = new Z();

        m.doSomethingWith(new D());
    }

}

class D {

}

class E {

}

class Z implements Makeable<D> {

    @Override
    public void doSomethingWith(D d) {

    }
}

class W implements Makeable {

    @Override
    public void doSomethingWith(Object o) {

    }
}

interface Makeable<T> {
    void doSomethingWith(T t);
}