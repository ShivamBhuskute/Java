// design a class rectangle containing members length and breadth and method functions area & perimeter 
class rectangle {
    int length, breadth;

    void area() {
        System.out.println("area : " + length * breadth);
    }

    void perimeter() {
        System.out.println("perimeter : " + 2 * (length + breadth));
    }

}

public class RectangleClass {
    public static void main(String[] args) {
        rectangle a, b;
        a = new rectangle();
        b = new rectangle();
        a.length = 3;
        a.breadth = 4;
        b.length = 5;
        b.breadth = 4;
        a.perimeter();
        b.perimeter();
        a.area();
        b.area();
    }
}