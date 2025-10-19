public class javadoc {
    /**
     * @param a
     * @param b
     * @return a+b
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * @throws ArithmeticException if b equal zero
     * @param a
     * @param b
     * @return a/b
     */
    public static int divide(int a, int b){
         if (b == 0) {
            throw new ArithmeticException("Divide on zero!");
        }
        return a/b;
    }
    public static void main(String args[]) {
        int a = 200;
        int b = 10;
        System.out.println(divide(a, b));
        System.out.println(sum(a, b));
    }
};