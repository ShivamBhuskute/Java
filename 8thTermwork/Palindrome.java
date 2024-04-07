public class Palindrome {

    public static int isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int number = 12321;
        if (isPalindrome(number) == 1) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

}