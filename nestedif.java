public class nestedif {
    public static void main(String[] args) {
        int a = 50, b = 50, c = 50, d = 50, e = 50;
        int total = a + b+ c + d + e;
        double per = total / 5;
        if(a >= 40 && b >= 40 && c >= 40 && d >= 40 && e >= 40)
        {
            if(per > 65) {
                System.out.println("Distinction");
            }
            else{
                System.out.println(per + "%");
            }
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
