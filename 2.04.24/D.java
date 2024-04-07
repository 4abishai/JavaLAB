import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class D extends JFrame {

    public D(String title) {
        super(title);
        setSize(800, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Enter the First Number"));

        JTextField textField1 = new JTextField();
        textField1.setColumns(10);
        add(textField1);

        add(new JLabel("Enter the Second Number"));

        JTextField textField2 = new JTextField();
        textField2.setColumns(10);
        add(textField2);

        add(new JLabel("Result"));

        JTextField textField3 = new JTextField();
        textField3.setColumns(10);
        add(textField3);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int input1 = Integer.parseInt(textField1.getText());
                int input2 = Integer.parseInt(textField2.getText());
                int result = input1 + input2;
                textField3.setText(String.valueOf(result));
            }
        });
        add(addButton);

        JButton subButton = new JButton("Sub");
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int input1 = Integer.parseInt(textField1.getText());
                int input2 = Integer.parseInt(textField2.getText());
                textField3.setText("" + (input1 - input2));
            }
        });
        add(subButton);

        JButton multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int input1 = Integer.parseInt(textField1.getText());
                int input2 = Integer.parseInt(textField2.getText());
                textField3.setText("" + input1 * input2);
            }
        });
        add(multiplyButton);

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });
        add(resetButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            D window = new D("My Calc");
        });
    }

}