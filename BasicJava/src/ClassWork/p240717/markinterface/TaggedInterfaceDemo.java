package ClassWork.p240717.markinterface;

class TaggedInterfaceDemo {

    public static void main(String[] args) {

        X x = new X();

        Y y = new Y();

        process(x);
        process(y);
    }

    private static void process(Object o) {
        if (o instanceof Tag) {
            
        }
    }

}

interface Tag {

}

class X implements Tag {

}

class Y {

}