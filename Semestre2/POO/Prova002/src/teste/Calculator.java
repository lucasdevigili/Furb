package teste;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    // Declare Swing components
    private JTextField display;
    private JButton[] numberButtons = new JButton[10];
    private JButton[] operationButtons = new JButton[4];
    private JButton addButton, subtractButton, multiplyButton, divideButton;
    private JButton decimalButton, equalsButton, clearButton, backspaceButton;
    private JPanel numberPanel = new JPanel(new GridLayout(4, 3));

    public Calculator() {

        // Create JFrame properties
        setTitle("Calculator");
        setSize(200, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());

        // Create display
        display = new JTextField();
        display.setPreferredSize(new Dimension(200, 30));
        display.setFont(new Font("Arial", Font.BOLD, 14));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Create buttons
        JPanel panel = new JPanel(new GridLayout(4, 4));

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            panel.add(numberButtons[i]);
        }

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");

        operationButtons[0] = addButton;
        operationButtons[1] = subtractButton;
        operationButtons[2] = multiplyButton;
        operationButtons[3] = divideButton;

        for (int i = 0; i < 4; i++) {
            operationButtons[i].addActionListener(this);
            panel.add(operationButtons[i]);
        }

        clearButton = new JButton("C");
        clearButton.addActionListener(this);
        panel.add(clearButton);

        backspaceButton = new JButton("Back");
        backspaceButton.addActionListener(this);
        panel.add(backspaceButton);

        decimalButton = new JButton(".");
        decimalButton.addActionListener(this);
        panel.add(decimalButton);

        equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        panel.add(equalsButton);

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberPanel.add(numberButtons[i]);
        }
        add(numberPanel, BorderLayout.CENTER);

        add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton clickedButton = (JButton) e.getSource();
            String buttonText = clickedButton.getText();
            if (Character.isDigit(buttonText.charAt(0))) {
                display.setText(display.getText().concat(buttonText));
            } else if (buttonText.equals(".")) {
                if (!display.getText().contains(".")) {
                    display.setText(display.getText().concat(buttonText));
                }
            } else if (buttonText.equals("C")) {
                display.setText("");
            } else if (buttonText.equals("Back")) {
                if (!display.getText().isEmpty()) {
                    display.setText(display.getText().substring(0, display.getText().length() - 1));
                }
            } else if (buttonText.equals("=")) {
                try {
                    String input = display.getText();
                    String[] operands = input.split("\\D+");
                    String[] operators = input.split("\\d+");
    
                    double result = Double.parseDouble(operands[0]);
                    for (int i = 0; i < operators.length - 1; i++) {
                        char operation = operators[i + 1].charAt(0);
                        double operand = Double.parseDouble(operands[i + 1]);
                        switch (operation) {
                            case '+':
                                result += operand;
                                break;
                            case '-':
                                result -= operand;
                                break;
                            case '*':
                                result *= operand;
                                break;
                            case '/':
                                result /= operand;
                                break;
                        }
                    }
                    display.setText(String.valueOf(result));
                } catch (Exception ex) {
                    display.setText("Error");
                }
            } else {
                operationButtons[0].setText("");
                operationButtons[1].setText("");
                operationButtons[2].setText("");
                operationButtons[3].setText("");
                operationButtons[0].setText(buttonText);
            }
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}