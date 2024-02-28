import java.util.Scanner;

public class Printlastdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int lastDigit = number % 10;
        System.out.println("Last digit: " + lastDigit);
        scanner.close();
    }
}