import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class ApplicationProgram extends JFrame implements ActionListener {
    private final JTextField display;
    private double firstNumber;
    private String operator = "";
    private boolean startNewNumber = true;

    public ApplicationProgram() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(470, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(0, 8));

        display = new JTextField("0");
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 52));
        display.setBackground(new Color(247, 248, 252));
        display.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
        display.setPreferredSize(new Dimension(0, 120));
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 2, 2));
        buttonPanel.setBackground(new Color(225, 229, 236));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 2, 2, 2));

        String[] labels = {
            "7", "8", "9", "\u00f7",
            "4", "5", "6", "\u00d7",
            "1", "2", "3", "\u2212",
            "0", "C", "=", "+"
        };

        for (String label : labels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 32));
            button.setFocusPainted(false);
            button.setBackground(new Color(248, 249, 252));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        if (command.matches("[0-9]")) {
            if (startNewNumber || display.getText().equals("0")) {
                display.setText(command);
            } else {
                display.setText(display.getText() + command);
            }
            startNewNumber = false;
        } else if (command.equals("C")) {
            clearCalculator();
        } else if (command.equals("=")) {
            calculateResult();
        } else {
            if (!operator.isEmpty() && !startNewNumber) {
                calculateResult();
            } else {
                firstNumber = Double.parseDouble(display.getText());
            }
            operator = command;
            startNewNumber = true;
        }
    }

    private void calculateResult() {
        if (operator.isEmpty() || startNewNumber) {
            return;
        }

        double secondNumber = Double.parseDouble(display.getText());
        double result;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "\u2212":
                result = firstNumber - secondNumber;
                break;
            case "\u00d7":
                result = firstNumber * secondNumber;
                break;
            case "\u00f7":
                if (secondNumber == 0) {
                    display.setText("Error");
                    operator = "";
                    startNewNumber = true;
                    return;
                }
                result = firstNumber / secondNumber;
                break;
            default:
                return;
        }

        firstNumber = result;
        display.setText(formatResult(result));
        operator = "";
        startNewNumber = true;
    }

    private void clearCalculator() {
        firstNumber = 0;
        operator = "";
        startNewNumber = true;
        display.setText("0");
    }

    private String formatResult(double result) {
        if (result == (long) result) {
            return Long.toString((long) result);
        }
        return Double.toString(result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ApplicationProgram calculator = new ApplicationProgram();
            calculator.setVisible(true);
        });
    }
}
