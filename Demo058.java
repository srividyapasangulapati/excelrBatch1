public class Demo058 {
    public class FactorsOfNumber {
        public static void main(String[] args) {
            int number = 28; 
            System.out.println("Factors of " + number + ":");
            printFactors(number);
        }
    
        public static void printFactors(int num) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    
}
