import java.util.Scanner;

public class Demo013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = (base * height) / 2;
        System.out.println("The area of the triangle is: " + area);
    }
}


