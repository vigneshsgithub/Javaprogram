import java.util.Scanner;

public class Print2ndlast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        number /= 10;
        int secondLastDigit = number % 10;
        System.out.println("Second last digit: " + secondLastDigit);
        scanner.close();
    }
}