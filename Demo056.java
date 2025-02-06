public class Demo056 {
    public class SumOfCubes {
        public static void main(String[] args) {
            int number = 123; 
            System.out.println("Sum of cubes of digits: " + sumOfCubes(number));
        }
    
        public static int sumOfCubes(int num) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }
            return sum;
        }
    }
    
}
