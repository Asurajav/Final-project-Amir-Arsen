package kz.arsen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReadOnline extends Container {
    private JLabel bookNameLabel;
    private JTextField bookNameText;

    private JButton backButton;
    private JButton searchButton;

    public ReadOnline(){
        setSize(500,600);
        setLayout(null);


        bookNameLabel=new JLabel("Book name");
        bookNameLabel.setBounds(90,60,60,30);
        add(bookNameLabel);

        bookNameText=new JTextField();
        bookNameText.setBounds(160,60,200,30);
        add(bookNameText);


        searchButton=new JButton("Search");
        searchButton.setBounds(90,100,130,30);
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /////ищем книгу в базе Данных
            }
        });
        add(searchButton);

        backButton=new JButton("Back");
        backButton.setBounds(230,100,130,30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.searchBookWindow.setVisible(true);
                Main.frame.readOnlineWindow.setVisible(false);
            }
        });
        add(backButton);


    }


}
