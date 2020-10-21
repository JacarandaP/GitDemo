import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jacaranda Perez
 * Date: 2020-10-20
 * Project: Demo1
 */

public class CheckBoxDemo extends JFrame implements ActionListener {
    private JPanel panel = new JPanel();
    private JLabel color = new JLabel("");
    private JCheckBox red = new JCheckBox("Red", false);
    private JCheckBox yellow = new JCheckBox("Yellow", false);
    private JCheckBox blue = new JCheckBox("Blue", false);

    public CheckBoxDemo() {

        panel.setLayout(new GridLayout(4, 1));
        panel.add(color);
        panel.add(red);
        panel.add(yellow);
        panel.add(blue);
        add(panel);
        red.addActionListener(this);
        yellow.addActionListener(this);
        blue.addActionListener(this);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(blue.isSelected() && red.isSelected() &&!yellow.isSelected()) {
            color.setText("purple");
            panel.setBackground(Color.magenta);
        }
        else if (red.isSelected() && blue.isSelected() && yellow.isSelected()){
            color.setText("brown");

        }
        else if (yellow.isSelected() && !blue.isSelected() && !red.isSelected()){
            color.setText("yellow");
        }
        else if (!yellow.isSelected() && !red.isSelected() && !blue.isSelected()){
            color.setText("no color chosen");
        }

    }

    public static void main(String[] args) {
        CheckBoxDemo checkBoxDemo = new CheckBoxDemo();
    }
}
