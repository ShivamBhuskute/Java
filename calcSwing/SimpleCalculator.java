import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private JPanel buttonPanel;
    private String operator;
    private double num1, num2, result;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        setLayout(new BorderLayout());
        setResizable(false);

        // Display (30% of the height)
        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 30));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setPreferredSize(new Dimension(getWidth(), getHeight() / 4));
        add(display, BorderLayout.NORTH);

        // Button panel (70% of the height)
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));  // 4x4 grid
        add(buttonPanel, BorderLayout.CENTER);

        buttonPanel.setBackground(Color.WHITE);

        // Add padding-like border by setting an empty border with a specific padding size
        buttonPanel.setBorder(new EmptyBorder(20, 20, 20, 20)); // 20px padding on all sides

        add(buttonPanel, BorderLayout.CENTER);

        // Buttons
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.setFocusPainted(false);
            button.setBackground(Color.LIGHT_GRAY);
            button.setOpaque(true);
            button.setPreferredSize(new Dimension(80, 80));

            // Making buttons circular
            button.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 
            button.setContentAreaFilled(false); 
            button.setOpaque(true);

            button.addActionListener(this);
            buttonPanel.add(button);
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            display.setText(display.getText() + command);
        } else if (command.equals("C")) {
            display.setText("");
            num1 = num2 = result = 0;
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            display.setText(String.valueOf(result));
        } else {
            operator = command;
            num1 = Double.parseDouble(display.getText());
            display.setText("");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
