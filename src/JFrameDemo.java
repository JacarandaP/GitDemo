import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




public class JFrameDemo extends JFrame implements ActionListener {

    private JPanel base = new JPanel();
    private JLabel text = new JLabel("Read this");
    private JLabel text2 = new JLabel("Carefully");
    private JLabel text3 = new JLabel("and listen");
    private JLabel text4 = new JLabel("and watch");
    //private JLabel text2 = new JLabel(new ImageIcon("C:\\ThisPC\\Pictures\\IMG_20200624_120559.jpg")); Not working
    private JButton button = new JButton("Click here");
    private JButton button2 = new JButton("Click or here");
    private JButton button3 = new JButton("Click or better here");

    JFrameDemo(){
        setLayout(new GridLayout(4,1));
        setTitle("Demo");
        add(base); //It is a filed on its own, NOT the base where everything rests
        base.setLayout(new BorderLayout());
        base.add(text, BorderLayout.NORTH);
        base.add(text2, BorderLayout.SOUTH);
        base.add(text4, BorderLayout.WEST);
        base.add(text3, BorderLayout.EAST);

        //add(text);
        //add(text2);
        add(button);
        add(button2);
        add(button3);
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        //button.add(text); label on the button
        pack(); //alternative to size
        //setSize(600, 300);
        setLocationRelativeTo(null); //centered
        //setLocation(300,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
	JFrameDemo jfDemo = new JFrameDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            button2.setText("here is better!");
            button.setEnabled(false);
            button3.setEnabled(false);
            button2.setEnabled(true);
        }
        else if (e.getSource() == button2){
            button3.setText("no, click here!");
            button.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(true);
            }
        }
    }

