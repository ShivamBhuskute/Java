// package abstractWindowToolkit;

import java.awt.*;
// import java.awt.event.*;

public class a extends Frame {
    a() {
        setSize(800, 800);
        setLayout(null);
        setVisible(true);
        Label l1 = new Label("AJP");
        l1.setBounds(50, 100, 90, 30);
        l1.setText("Name");
        add(l1);

        TextField t = new TextField();
        t.setBounds(160, 100, 90, 30);
        // t.setText("hello");
        add(t);

        Checkbox cb1 = new Checkbox("Java", null, true);
        Checkbox cb2 = new Checkbox("JSP", null, false);
        Checkbox cb3 = new Checkbox("CNS", null, false);
        cb1.setBounds(50, 160, 50, 50);
        cb2.setBounds(150, 160, 50, 50);
        cb3.setBounds(250, 160, 50, 50);
        add(cb1);
        add(cb2);
        add(cb3);

        CheckboxGroup c = new CheckboxGroup();
        cb1.setCheckboxGroup(c);
        cb2.setCheckboxGroup(c);
        cb3.setCheckboxGroup(c);

        List li = new List(3, true);
        li.add("CS");
        li.add("IT");
        li.add("Chemical");
        add(li);
        li.setBounds(50, 250, 50, 50);

        Choice ce = new Choice();
        ce.add("AJP");
        ce.add("IT");
        ce.add("CNS");
        ce.setBounds(150, 250, 50, 50);
        add(ce);

        TextArea ta = new TextArea();
        ta.setBounds(50, 350, 200, 150);
        add(ta);

        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);
        Menu file = new Menu("File");
        MenuItem i1, i2;
        file.add(new MenuItem("New"));
        file.add(new MenuItem("Open"));
        mbar.add(file);

    }

    public static void main(String[] args) {
        new a();
    }
}