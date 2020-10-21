/**
 * Created by Jacaranda Perez
 * Date: 2020-10-19
 * Project: Demo1
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import javax.swing.*;

public class JFrameInnerClass extends JFrame {


    List<String> imageFileNames = new ArrayList<>();

    private JLabel imageViewer;
    private JButton imageChangeButton = new JButton("change picture");
    private JPanel panel = new JPanel();
    final String imagePath = "C:\\Users\\jacky\\Pictures\\Kiruna\\311214";
    Path imageFolder = Paths.get(imagePath);
    int imageIndex = 0;
    int imageCount = 0;

    class showPicturesListener implements ActionListener {
    public void actionPerformed (ActionEvent e){
    imageIndex = (imageIndex + 1) % imageCount;
    imageViewer.setIcon(new ImageIcon( imageFileNames.get(imageIndex)));

        }
    }

    protected List <String> loadImageNames(Path imageDir){

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(imageDir)) {
            for (Path file: stream) {
                imageFileNames.add(file.toString());
                System.out.println(file.getFileName().toString());
            }
        } catch (IOException | DirectoryIteratorException x) {
            x.printStackTrace();
        }
        return imageFileNames;
    }

    JFrameInnerClass () {
        showPicturesListener listener = new showPicturesListener();
        imageFileNames = loadImageNames(imageFolder);
        imageCount = imageFileNames.size();
        imageViewer = new JLabel(new ImageIcon(imageFileNames.get(imageIndex)));
        add(panel);
        panel.setLayout(new GridLayout(2,1));
        panel.setBackground(Color.BLACK);
        panel.add(imageViewer);
        panel.add(imageChangeButton);
        imageChangeButton.addActionListener(listener);
        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        JFrameInnerClass jfInnerClass = new JFrameInnerClass();
    }

}