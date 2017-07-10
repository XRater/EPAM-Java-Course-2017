package ClassWork.p100717;

public class TestClass {

//    public void foo(int x) {
//        System.out.println(x);;
//    }

    public static void main(String[] args) {

        TestClass testclass = new TestClass();
        testclass.foo(1);
        TestClass.foo(1);
    }

    public static void foo(int x) {
        System.out.println(x);
    }

}
