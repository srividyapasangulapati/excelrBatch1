class FizzBizz {

    public static String getFizzBizz(int num) {
        if (num <= 0) {
            return "Error";
        }
        if (num % 3 == 0 && num % 5 == 0) {
            return "FIZZBIZZ";
        }
        else if (num % 3 == 0) {
            return "FIZZ";
        }
        else if (num % 5 == 0) {
            return "BIZZ";
        }
        else {
            return String.valueOf(num);
        }
    }
    public static void main(String[] args) {
        int[] testInputs = {33, 5, 15, 7, -1, 0};
        
        System.out.println("Test Cases:");
        for (int num : testInputs) {
            System.out.println("Input: " + num + " Output: " + getFizzBizz(num));
        }
    }
}
