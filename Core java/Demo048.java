import java.util.Scanner;

    public class Demo048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int temp = Math.abs(number);
        
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
        
        scanner.close();
    }
}