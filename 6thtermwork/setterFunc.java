// this fn is use to set values of private data members genrally there names start with there name set
class Rectangle {
    private int length, breadth;

    void area() {
        System.out.println("area : " + length * breadth);
    }

    void perimeter() {
        System.out.println("perimeter : " + 2 * (length + breadth));
    }

    public void setDimension(int l, int b) {
        length = l;
        breadth = b;
    }
}

public class setterFunc {
    public static void main(String[] args) {
        Rectangle a, b;
        a = new Rectangle();
        b = new Rectangle();
        a.setDimension(3, 8);
        b.setDimension(4, 6);
        a.perimeter();
        b.perimeter();
        a.area();
        b.area();
    }
}