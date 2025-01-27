import java.util.Scanner;
public class Demo043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an uppercase character: ");
        char ch = scanner.next().charAt(0);
        if (Character.isUpperCase(ch)) {
            char lowerCase = Character.toLowerCase(ch);
            System.out.println("The lowercase equivalent is: " + lowerCase);
        } else {
            System.out.println("The entered character is not an uppercase letter.");
        }

        scanner.close();
    }
}