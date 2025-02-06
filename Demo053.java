public class Demo053 {
    public class StrongNumberChecker {
        public static void main(String[] args) {
            int number = 145;
            if (isStrong(number)) {
                System.out.println(number + " is a Strong number.");
            } else {
                System.out.println(number + " is not a Strong number.");
            }
        }
    
        public static boolean isStrong(int num) {
            int originalNum = num;
            int sum = 0;
            
            while (num > 0) {
                int digit = num % 10;
                sum += factorial(digit);
                num /= 10;
            }
            
            return originalNum == sum;
        }
    
        public static int factorial(int n) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
    
}
