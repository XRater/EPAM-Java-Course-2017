package ClassWork.p310717.exception;

class UseStack {

    public static void main(String[] args) {

        StringStackWithThrow stack = new StringStackWithThrow(2);

        boolean success = false;
        try {
            stack.push("one");
//            stack.push(null);
            stack.push("two");
            success = stack.push("three");
        } catch (StringStackWithThrow.Overflow e) {
            System.err.println("Stack overflow occured ith size " + e.getSize());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
