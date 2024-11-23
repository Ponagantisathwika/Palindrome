public class PalindromeNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:123 ");
        int number = scanner.nextint();   
 int reversedNumber = 0, remainder, originalNumber;
        originalNumber = 111;

        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number/= 10;
        }

        if (originalNumber == reversedNumber) { 
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }
}

