import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class E extends JFrame {

    public E(String title) {
        super(title);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] colorNames = { "White", "Orange", "Red", "Blue" };
        Color[] colors = { Color.WHITE, Color.ORANGE, Color.RED, Color.BLUE };

        JPanel panel = new JPanel();
        JList<String> colorList = new JList<>(colorNames);
        JButton changeColorButton = new JButton("Click");

        changeColorButton.addActionListener((ActionEvent e) -> {
            int selectedIndex = colorList.getSelectedIndex();
            if (selectedIndex >= 0 && selectedIndex < colors.length) {
                panel.setBackground(colors[selectedIndex]);
            }
        });

        panel.add(colorList);
        panel.add(changeColorButton);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new E("My frame"));
    }
}
