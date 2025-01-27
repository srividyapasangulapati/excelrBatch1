public class Demo014 {
        public static void main(String[] args) {
            int number = 5;
            boolean flag = true;
            System.out.println("Unary plus: +" + number);    
            System.out.println("Unary minus: -" + number);  
            System.out.println("Postfix increment: " + (number++)); 
            System.out.println("After postfix increment: " + number); 
            System.out.println("Prefix increment: " + (++number)); 
            System.out.println("Postfix decrement: " + (number--)); 
            System.out.println("After postfix decrement: " + number); 
            System.out.println("Prefix decrement: " + (--number)); 
            System.out.println("Logical NOT of true: " + !flag); 
            int bitwiseExample = 5;  
            System.out.println("Bitwise complement of 5: " + ~bitwiseExample); 
        }
    }
    

