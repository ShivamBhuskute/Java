public class DuckNo {

    public static void main(String[] args) {
        int n = 1023;
        int r;
        int found = 0;

        int originalNumber = n;

        while (n > 0) {
            r = n % 10;
            if (r == 0) {
                found++;
            }
            n = n / 10;
        }

        if (found != 0) {
            System.out.println(originalNumber + " is a duck number.");
        } else {
            System.out.println(originalNumber + " is not a duck number.");
        }
    }
}