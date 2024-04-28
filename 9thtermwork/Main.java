class Rectangle {
    private int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }

    int getPerimeter() {
        return 2 * (length + breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle A = new Rectangle(5, 7);
        Rectangle B = new Rectangle(10, 20);

        System.out.println("Rectangle A:");
        System.out.println("Area: " + A.getArea());
        System.out.println("Perimeter: " + A.getPerimeter());

        System.out.println("\nRectangle B:");
        System.out.println("Area: " + B.getArea());
    }
}