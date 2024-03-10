public class printOdd {
    static void odd(){
        for (int i = 1; i <= 100; i+=2) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        odd();
    }
}