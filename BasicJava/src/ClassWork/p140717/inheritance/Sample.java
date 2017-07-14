package ClassWork.p140717.inheritance;

public class Sample {

    public static void main(String[] args) {

        Class<Sample> sample = Sample.class;

        A a = new C();

        C c = (C)a;
        c.m();
        System.out.println(a instanceof C);
    }

}
