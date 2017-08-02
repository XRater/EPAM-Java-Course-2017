package ClassWork.p020817.generics;

class UseStack {

    public static void main(String[] args) {

        GenericStack<Number> s = new GenericStack<>();

        s.push(1);
        s.push(2);
        s.pop();
        s.push(1.2);
        s.push(4 / 5.0);
        System.out.println(s);
    }
}
