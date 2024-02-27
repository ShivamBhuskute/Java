public class marks {
    public static void main(String[] args) {
        int a = 99, b = 95, c = 91, d = 85, e = 85;
        int total = a + b + c + d + e;
        double p = total / 5.0;

        System.out.println("Total marks are: " + total);

        if (a >= 40 && b >= 40 && c >= 40 && d >= 40 && e >= 40) {
            System.out.println("Student has passed");
            System.out.println("Percentage is: " + p);
        } else {
            System.out.println("Student has failed");
        }
    }
}
