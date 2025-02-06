public class Demo057 {
    public class SumOfFirstLastDigits {
        public static void main(String[] args) {
            int number = 12345; 
            System.out.println("Sum of first and last digits: " + sumOfFirstLast(number));
        }
    
        public static int sumOfFirstLast(int num) {
            int lastDigit = num % 10;
            int firstDigit = 0;
            
            while (num > 0) {
                firstDigit = num % 10;
                num /= 10;
            }
            
            return firstDigit + lastDigit;
        }
    }
}
