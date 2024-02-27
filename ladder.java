public class ladder {
    public static void main(String[] args) {
        double p = 90;
        
        if (p >= 75) {
            System.out.println("Dinstinction");
        } else if (p >= 60) {
            System.out.println("1st-class");
        } else if (p >= 50) {
            System.out.println("2nd-class");
        } else if (p >= 40) {
            System.out.println("3rd class");
        } else {
            System.out.println("Fail");
        }
    }
}
