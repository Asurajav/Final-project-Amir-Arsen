package kz.arsen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class AdminMenu extends Container {
    private JButton deleteButton;
    private JButton listClientButton;
    private JButton backButton;

    public static JTextArea listClientText;

    public AdminMenu(){
        setSize(500,800);
        setLayout(null);

        deleteButton=new JButton("delete with id");
        deleteButton.setBounds(100, 80, 300, 30);
        deleteButton.setBackground(Color.DARK_GRAY);
        deleteButton.setForeground(Color.decode("#FFCC33"));

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.adminMenuWindow.setVisible(false);
                Main.frame.deleteWithIdWindow.setVisible(true);
            }
        });

        add(deleteButton);


        listClientButton=new JButton("List Clients");
        listClientButton.setBounds(100, 120, 300, 30);
        listClientButton.setBackground(Color.DARK_GRAY);
        listClientButton.setForeground(Color.decode("#FFCC33"));

        listClientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                PackageData pd = new PackageData("LIST");
                Main.connect(pd);
            }
        });

        add(listClientButton);


        backButton=new JButton("back");
        backButton.setBounds(100, 160, 300, 30);
        backButton.setBackground(Color.DARK_GRAY);
        backButton.setForeground(Color.decode("#FFCC33"));

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.adminMenuWindow.setVisible(false);
                Main.frame.adminloginWindow.setVisible(true);
            }
        });

        add(backButton);

        listClientText =new JTextArea();
        listClientText.setBounds(100,200,300,360);
        listClientText.setBackground(Color.DARK_GRAY);
        listClientText.setForeground(Color.decode("#FFCC33"));
        listClientText.setCaretColor(Color.RED);
        add(listClientText);



    }
}

