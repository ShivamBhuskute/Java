public class fnWithArgs {
    static void fn(int first, int last) {
        for (int i = first; i <= last; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        fn(5, 10);
    }
}