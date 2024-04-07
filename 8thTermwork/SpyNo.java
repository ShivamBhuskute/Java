public class SpyNo {

    public static void main(String[] args) {
        int number = 1124; 
        int sum = 0;
        int product = 1;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        if (sum == product) {
            System.out.println(originalNumber + " is a spy number.");
        } else {
            System.out.println(originalNumber + " is not a spy number.");
        }
    }
}