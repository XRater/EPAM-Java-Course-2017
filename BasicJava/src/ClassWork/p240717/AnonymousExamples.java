package ClassWork.p240717;

class AnonymousExamples {

    interface Operation {
        int apply(int a, int b);
    }

    static class Addition implements Operation {

        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    }

    static class Multiplication implements Operation {

        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    }

    public static void main(String[] args) {

        System.out.println(process(new Addition(), 10, 20));
        System.out.println(process(new Multiplication(), 10, 20));

//        System.out.println(process(new Operation() {
//            @Override
//            int apply(int a, int b) {
//                return a / b;
//            }
//        }, 40, 10));

        System.out.println(process(new Operation() {
            @Override
            public int apply(int a, int b) {
                return a / b;
            }
        }, 40, 10));

        System.out.println(process((a, b) -> a / b, 40, 10));
        
        class Subtract implements Operation {

            @Override
            public int apply(int a, int b) {
                return a - b;
            }
        }

        System.out.println(process(new Subtract(), 20, 30));
    }

    private static int process(Operation o, int a, int b) {
        return o.apply(a, b);
    }
}
