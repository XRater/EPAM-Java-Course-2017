package ClassWork.p020817.defaults;

class DefaultsAndThisExample {

    public static void main(String[] args) {


    }

}

interface X {

    void foo();

    void bar();

    default void process() {
        foo();
        this.bar(); //same as bar()
    }
}

class A implements X {

    @Override
    public void foo() {

    }

    @Override
    public void bar() {

    }
}