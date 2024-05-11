class Student {
    private int rollNo;
    String name;

    Student(int rollNo1, String name1) {
        rollNo = rollNo1;
        name = name1;
    }

    Student(int rollNo1) {
        rollNo = rollNo1;
    }

    void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    void displayInfo(int rollNo) {
        System.out.println("Roll no: " + rollNo);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Student A = new Student(4117, "Tejaswini");
        Student B = new Student(3012);

        System.out.println("Student A:");
        A.displayInfo();
        System.out.println();
        
        System.out.println("Student B:");
        B.displayInfo(3012);
    }
}