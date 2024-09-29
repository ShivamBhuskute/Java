public class divisible {
    public static void main(String[] args) {
        int i = 100;
        while (i >= 1) {
            if (i % 2 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
