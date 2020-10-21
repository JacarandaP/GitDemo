/**
 * Created by Jacaranda Perez
 * Date: 2020-10-20
 * Project: Demo1
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import javax.swing.*;

//public class JFrameDemoB extends JFrame implements ActionListener{

    public class JFrameDemoB extends JFrame {

    private JLabel picsContainer = new JLabel(new ImageIcon("C:\\Users\\jacky\\Pictures\\Summer 2015\\Italy\\Siena\\20150822_101730.jpg"));
    private JButton button = new JButton("click here to change picture");
    private JPanel base = new JPanel();
    int toggler = 0;

    JFrameDemoB () {
        base.setLayout(new GridLayout(2,1));
        base.setBackground(Color.BLACK);
        base.add(picsContainer);
        base.add(button);
        //button.addActionListener(this);
        button.addActionListener(ae -> action());
        //picsContainer.setHorizontalAlignment(SwingConstants.LEFT);
        this.add(base);
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        JFrameDemoB jfDemoB = new JFrameDemoB();
    }

  /*  @Override
    public void actionPerformed(ActionEvent e) {
        if(toggler == 0) {
            picsContainer.setIcon(new ImageIcon("C:\\Users\\jacky\\Pictures\\Summer 2015\\Italy\\Siena\\20150822_101730.jpg"));
            toggler = 1;
        }
        else if(toggler == 1){
            picsContainer.setIcon(new ImageIcon("C:\\Users\\jacky\\Pictures\\Summer 2015\\Italy\\Siena\\20150822_095703.jpg"));
            toggler = 0;
        }
    } */

    public void action() {
        if(toggler == 0) {
            picsContainer.setIcon(new ImageIcon("C:\\Users\\jacky\\Pictures\\Summer 2015\\Italy\\Siena\\20150822_101730.jpg"));
            toggler = 1;
        }
        else if(toggler == 1){
            picsContainer.setIcon(new ImageIcon("C:\\Users\\jacky\\Pictures\\Summer 2015\\Italy\\Siena\\20150822_095703.jpg"));
            toggler = 0;
        }
    }

}