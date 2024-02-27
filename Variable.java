public class Variable {
    public static void main(String[] args) {
        int a = 5, b = 8, c;
        System.out.println("Numbers before swapping are a: " + a + " and b: " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("Numbers before swapping are a: " + a + " and b: " + b);      
    }
}
