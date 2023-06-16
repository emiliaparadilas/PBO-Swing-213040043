package PBO_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldExample extends JFrame {
    private JTextField textField1, textField2;

    public JTextFieldExample() {
        setTitle("JTextField Example");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField1 = new JTextField();
        textField2 = new JTextField();
        JButton button = new JButton("Jumlah");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int sum = num1 + num2;
                JOptionPane.showMessageDialog(null, "Jumlah: " + sum, "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        setLayout(new GridLayout(4, 2));
        add(textField1);
        add(new JLabel());
        add(textField2);
        add(new JLabel());
        add(button);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JTextFieldExample example = new JTextFieldExample();
                ((Window) example).setVisible(true);
            }
        });
    }
}
