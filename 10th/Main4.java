import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the positive size of the array: ");
            size = sc.nextInt();
        } while (size <= 0);

        int[] LA = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            LA[i] = sc.nextInt();
        }

        System.out.println("Array is as follows: ");

        for (int i = 0; i < LA.length; i++) {
            System.out.print(LA[i] + " ");
        }
    }
}