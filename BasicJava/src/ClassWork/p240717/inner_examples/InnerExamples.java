package ClassWork.p240717.inner_examples;

class InnerExamples {

    private int state;


    public void change() {
        state++;
    }

    private class Processor {

        public void process() {
            state = 20;
            change();
            change();
        }

    }
}
