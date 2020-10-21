import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Jacaranda Perez
 * Date: 2020-10-21
 * Project: Demo1
 */

public class Listeners extends JFrame {

    private JPanel panel = new JPanel();
    private JButton button = new JButton("come here");

    Listeners() {

        panel.setLayout(new FlowLayout());
        panel.add(button);
        add(panel);
        button.setBackground(null);
        button.addMouseListener(myMouse);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    MouseAdapter myMouse = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
        button.setBackground(Color.RED);
        }

        @Override
        public void mouseExited(MouseEvent e) {
           button.setBackground(null);
        }
    };

    public static void main(String[] args) {
    Listeners mouseListenerExample = new Listeners();
    }
}

