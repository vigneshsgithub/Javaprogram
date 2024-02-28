public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Change n to the desired number of Fibonacci numbers
        int a = 0, b = 1;
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
