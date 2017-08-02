package ClassWork.p020817.generics;

class GenericMethodExamples {

    public static void main(String[] args) {

//        String modified = XX<Integer>.<String>modify("one");
        XX<Integer> x = new XX<>();

        x.modify(1);
    }

}

class XX<T> {


    public <U> void modify(T t) {
        System.out.println(t.getClass());
    }

}