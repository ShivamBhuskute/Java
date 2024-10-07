import java.awt.*;
import java.awt.event.*;

public class CalculatorAWT extends Frame implements ActionListener {
    // Components of the calculator
    TextField inputField;
    Button[] numberButtons = new Button[10];
    Button[] functionButtons = new Button[8];
    Button addButton, subButton, mulButton, divButton;
    Button decButton, equButton, delButton, clrButton;
    Panel panel;

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public CalculatorAWT() {
        // Frame settings
        setTitle("AWT Calculator");
        setSize(400, 500);
        setLayout(null);
        setVisible(true);

        // Create input field
        inputField = new TextField();
        inputField.setBounds(50, 50, 300, 50);
        add(inputField);

        // Initialize the function buttons
        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");
        decButton = new Button(".");
        equButton = new Button("=");
        delButton = new Button("Del");
        clrButton = new Button("Clr");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        // Set the action listeners for the function buttons
        for (int i = 0; i < functionButtons.length; i++) {
            functionButtons[i].addActionListener(this);
        }

        // Initialize the number buttons
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // Create a panel to hold buttons in a grid layout
        panel = new Panel();
        panel.setBounds(50, 120, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Add buttons to the panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        // Add panel to the frame
        add(panel);
        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);
        add(delButton);
        add(clrButton);

        // Close operation for the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                inputField.setText(inputField.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == decButton) {
            inputField.setText(inputField.getText().concat("."));
        }

        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(inputField.getText());
            operator = '+';
            inputField.setText("");
        }

        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(inputField.getText());
            operator = '-';
            inputField.setText("");
        }

        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(inputField.getText());
            operator = '*';
            inputField.setText("");
        }

        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(inputField.getText());
            operator = '/';
            inputField.setText("");
        }

        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(inputField.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            inputField.setText(String.valueOf(result));
            num1 = result;
        }

        if (e.getSource() == clrButton) {
            inputField.setText("");
        }

        if (e.getSource() == delButton) {
            String text = inputField.getText();
            inputField.setText(text.length() > 0 ? text.substring(0, text.length() - 1) : "");
        }
    }

    public static void main(String[] args) {
        new CalculatorAWT();
    }
}
