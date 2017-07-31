package ClassWork.p310717.exception.tryexamples;

class TryWithResourceExample {

    static class Resource implements AutoCloseable {

        public void close() {
        }

        public void use() {
        }

    }

    public static void main(String[] args) {

        Resource r = new Resource();

        try {
            r.use();
        } finally {
            r.close();
        }

        try (Resource r2 = new Resource()) {
            r2.use();
        }

    }

}
