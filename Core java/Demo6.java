import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
    System.out.println("Enter the name: ");
        String username = obj.next();
        System.out.println("Enter the password: ");
        String psw = obj.next();
        while (username.equals("sri") && psw.equals("sri_001")) {
            System.out.println("Hello, welcome to malla reddy university!");
            break; 
        }
    }
}