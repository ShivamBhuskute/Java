// design a class box having members length , bradth , height and member functions set dimension & volume
class Box {
    private int length, breadth, height;

    void volume() {
        System.out.println("The volume is: " + length * breadth * height);
    }

    public void setDimension(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }
}

public class setBox {
    public static void main(String[] args) {
        Box a;
        a = new Box();
        a.setDimension(10, 5, 3);
        a.volume();
    }
}