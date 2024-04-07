
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class F extends JFrame {

    public F(String title) {
        super(title);
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox<Integer> redComboBox = new JComboBox<>();
        JComboBox<Integer> greenComboBox = new JComboBox<>();
        JComboBox<Integer> blueComboBox = new JComboBox<>();

        for (int i = 0; i <= 255; i++) {
            redComboBox.addItem(i);
            greenComboBox.addItem(i);
            blueComboBox.addItem(i);
        }

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton btn = new JButton("Show Output");
        btn.addActionListener((ActionEvent e) -> {
            int red = (int) redComboBox.getSelectedItem();
            int green = (int) greenComboBox.getSelectedItem();
            int blue = (int) blueComboBox.getSelectedItem();

            Color color = new Color(red, green, blue);
            panel.setBackground(color);
        });

        // Create JLabel objects
        JLabel redL = new JLabel("Red:");
        redL.setForeground(Color.RED);
        JLabel greenL = new JLabel("Green:");
        greenL.setForeground(Color.GREEN);
        JLabel blueL = new JLabel("Blue:");
        blueL.setForeground(Color.BLUE);

        panel.add(redL);
        panel.add(redComboBox);
        panel.add(greenL);
        panel.add(greenComboBox);
        panel.add(blueL);
        panel.add(blueComboBox);
        panel.add(btn);
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            F app = new F("My Frame");
            app.setVisible(true);
        });
    }
}
