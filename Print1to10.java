public class Print1to10 {
    public static void main(String[] args) {
        System.out.println("Printing numbers 1 to 10 except 5 using continue:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}