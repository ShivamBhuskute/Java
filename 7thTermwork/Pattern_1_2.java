public class Pattern_1_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int numberToPrint;

            if (i % 2 == 0) {
                numberToPrint = 2;
            } else {
                numberToPrint = 1;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(numberToPrint + " ");
            }

            System.out.println();
        }
    }
}