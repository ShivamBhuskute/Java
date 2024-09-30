// package calcSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private String operator;
    private double firstOperand;

    public Calculator() {
        // Set up the frame
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); 
        setLayout(new BorderLayout());

        // Create display
        display = createDisplay();
        add(display, BorderLayout.NORTH);

        // Create buttons
        JPanel buttonPanel = createButtonPanel();
        add(buttonPanel, BorderLayout.CENTER);
    }

    private JTextField createDisplay() {
        JTextField textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        return textField;
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            RoundedButton button = new RoundedButton(label);
            button.addActionListener(this);
            panel.add(button);
        }

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("C")) {
            clearDisplay();
        } else if (command.equals("=")) {
            calculateResult();
        } else {
            handleInput(command);
        }
    }

    private void clearDisplay() {
        display.setText("");
    }

    private void calculateResult() {
        double secondOperand = Double.parseDouble(display.getText());
        double result = performCalculation(firstOperand, secondOperand, operator);
        display.setText(String.valueOf(result));
    }

    private void handleInput(String command) {
        if (isOperator(command)) {
            firstOperand = Double.parseDouble(display.getText());
            operator = command;
            clearDisplay();
        } else {
            display.setText(display.getText() + command);
        }
    }

    private boolean isOperator(String command) {
        return "+-*/".contains(command);
    }

    private double performCalculation(double first, double second, String operator) {
        switch (operator) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                if (second != 0) return first / second;
                JOptionPane.showMessageDialog(this, "Cannot divide by zero");
                return 0;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }

    // Custom Rounded Button Class
    class RoundedButton extends JButton {
        public RoundedButton(String label) {
            super(label);
            setFocusPainted(false);
            setContentAreaFilled(false);
            setBorderPainted(false);
            setBackground(Color.LIGHT_GRAY); // Button color
            setForeground(Color.BLACK); // Text color
            setFont(new Font("Arial", Font.BOLD, 18)); // Font size for buttons
            setPreferredSize(new Dimension(50, 50)); // Small size for buttons
        }

        @Override
        protected void paintComponent(Graphics g) {
            int diameter = Math.min(getWidth(), getHeight());
            g.setColor(getBackground());
            g.fillOval(0, 0, diameter, diameter); // Draw a circle

            super.paintComponent(g); // Call the parent method to draw text
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(50, 50); // Ensure preferred size remains constant
        }
    }
}
