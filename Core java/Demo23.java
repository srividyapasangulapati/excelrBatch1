public class Demo23 {
        public static void main(String[] args) {
            System.out.println(isPalindrome(232)); 
            System.out.println(isPalindrome(345)); 
            System.out.println(isPalindrome(-121)); 
            System.out.println(isPalindrome(0)); 
        }
    
        public static int isPalindrome(int x) {
            if (x <= 0) {
                return -1;
            }
            int originalNumber = x;
            int reversedNumber = 0;
            while (x > 0) {
                int digit = x % 10;
                reversedNumber = reversedNumber * 10 + digit;
                x /= 10;
            }
            if (reversedNumber == originalNumber) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    
