public class Print1to4 {
    public static void main(String[] args) {
        System.out.println("Printing numbers 1 to 4 using break:");
        for (int i = 1; i <= 4; i++) {
            System.out.println(i);
            if (i == 4) {
                break;
            }
        }
    }
}