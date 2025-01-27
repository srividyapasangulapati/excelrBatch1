import java.util.Scanner;
    public class Demo040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println("The character is an uppercase letter.");
        }
        else if (Character.isLowerCase(ch)) {
            System.out.println("The character is a lowercase letter.");
        }
        else if (Character.isDigit(ch)) {
            System.out.println("The character is a digit.");
        }
        else {
            System.out.println("The character is a special character.");
        }

        scanner.close();
    }
}
