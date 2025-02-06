public class Demo055 {
    public class SumOfSquares {
        public static void main(String[] args) {
            int number = 123; 
            System.out.println("Sum of squares of digits: " + sumOfSquares(number));
        }
    
        public static int sumOfSquares(int num) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            return sum;
        }
    }
    
}
