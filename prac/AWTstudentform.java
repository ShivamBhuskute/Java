import java.awt.*;

class p3p1 extends Frame {
    public p3p1() {
        setSize(1000, 1000);
        setVisible(true);
        setLayout(null);
        setTitle("Student registeriation form ");
        Label titLabel = new Label("Student Registeriation form ");
        titLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titLabel.setBounds(300, 50, 400, 50);
        add(titLabel);
        setResizable(false);

        Label nameofstudent = new Label(" Name: ");
        nameofstudent.setBounds(330, 120, 100, 20);
        add(nameofstudent);
        TextField nametf = new TextField(" ");
        nametf.setBounds(430, 120, 100, 20);
        add(nametf);
        Label phonenum = new Label(" Phone no.: ");
        phonenum.setBounds(330, 150, 100, 20);
        TextField phontf = new TextField();
        phontf.setBounds(430, 150, 100, 20);
        add(phonenum);
        add(phontf);
        Label email = new Label(" Email: ");
        email.setBounds(330, 180, 100, 20);
        TextField emaField = new TextField();
        emaField.setBounds(430, 180, 100, 20);
        add(email);
        add(emaField);
        Label choicLabel = new Label(" Select your class : ");
        choicLabel.setBounds(330, 220, 110, 30);
        add(choicLabel);
        Choice c = new Choice();
        c.add("10th");
        c.add("11th");
        c.add("12th");
        c.setBounds(330, 260, 100, 80);
        add(c);
        Label forsub = new Label("Select your subjects : ");
        forsub.setBounds(330, 300, 110, 30);
        add(forsub);
        Checkbox math = new Checkbox("Maths");
        math.setBounds(330, 330, 60, 30);
        Checkbox science = new Checkbox("science");
        science.setBounds(390, 330, 60, 30);
        Checkbox physcis = new Checkbox("physics");
        physcis.setBounds(460, 330, 60, 30);
        add(math);
        add(physcis);
        add(science);
        Label forgender = new Label("Select your gender : ");
        forgender.setBounds(330, 370, 110, 30);
        add(forgender);
        CheckboxGroup check = new CheckboxGroup();
        Checkbox male = new Checkbox("Male ", check, false);
        Checkbox female = new Checkbox("Female ", check, false);
        male.setBounds(330, 410, 50, 20);
        add(male);
        female.setBounds(380, 410, 60, 20);
        add(female);
        Label foraddress = new Label("Write your Address :");
        foraddress.setBounds(330, 450, 120, 30);
        add(foraddress);
        TextArea address = new TextArea();
        address.setBounds(460, 450, 150, 100);
        add(address);
        Button submit = new Button("Sumbit");
        submit.setBounds(330, 620, 70, 30);
        add(submit);
        Button reset = new Button("Reset");
        reset.setBounds(430, 620, 70, 30);
        add(reset);

    }
}

public class AWTstudentform {
    public static void main(String[] args) {
        new p3p1();

    }
}