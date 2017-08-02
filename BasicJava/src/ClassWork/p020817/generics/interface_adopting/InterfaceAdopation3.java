package ClassWork.p020817.generics.interface_adopting;

class InterfaceAdopation3 {

    public static void main(String[] args) {

        Cleaning<B1> c = new Cleaner<>();
//        c.clean("one");

//        Cleaning<Object> c2 = (Cleaning<Object>) c;
    }

}


class A1 {

}

class B1 extends A1 {

}

interface Cleaning<T> {
    void clean(T t);
}

class Cleaner<T> implements Cleaning<T> {

    @Override
    public void clean(T t) {

    }
}