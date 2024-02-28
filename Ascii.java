public class Ascii {
    public static void main(String[] args) {
        System.out.println("ASCII values from A to Z:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            int asciiValue = ch;
            System.out.println(ch + ": " + asciiValue);
        }
    }
}
