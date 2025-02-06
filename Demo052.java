public class Demo052 {
    public class ArmstrongChecker {
        public static void main(String[] args) {
            int number = 153; 
            if (isArmstrong(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
    
        public static boolean isArmstrong(int num) {
            int originalNum = num;
            int sum = 0;
            int digits = String.valueOf(num).length();
            
            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }
            
            return originalNum == sum;
        }
    }
}
