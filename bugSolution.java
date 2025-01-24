public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        try {
            if (x != 0) {
                y = 5 / x;
            } else {
                System.out.println("Division by zero detected!");
            }
            System.out.println(y);
        } catch (ArithmeticException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}