package kz.arsen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class MainMenu extends Container {
    private JButton adminButton;
    private JButton loginButton;
    private JButton registerButton;
    private JButton exitButton;


    public MainMenu(){
        setSize(500,600);
        setLayout(null);

        adminButton=new JButton("Admin login");
        adminButton.setBounds(100, 40, 300, 30);
        adminButton.setBackground(Color.DARK_GRAY);
        adminButton.setForeground(Color.decode("#FFCC33"));

        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.menuWindow.setVisible(false);
                Main.frame.adminloginWindow.setVisible(true);
            }
        });

        add(adminButton);


        loginButton=new JButton("Login");
        loginButton.setBounds(100, 80, 300, 30);
        loginButton.setBackground(Color.DARK_GRAY);
        loginButton.setForeground(Color.decode("#FFCC33"));

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.menuWindow.setVisible(false);
                Main.frame.loginWindow.setVisible(true);
            }
        });

        add(loginButton);


        registerButton=new JButton("Registration");
        registerButton.setBounds(100, 120, 300, 30);
        registerButton.setBackground(Color.DARK_GRAY);
        registerButton.setForeground(Color.decode("#FFCC33"));

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.menuWindow.setVisible(false);
                Main.frame.registrationWindow.setVisible(true);
            }
        });

        add(registerButton);


        /*JButton searchButton = new JButton("Search Book");////Amir мынау search Button сонын коды
        searchButton.setBounds(100, 160, 300, 30);
        searchButton.setBackground(Color.DARK_GRAY);
        searchButton.setForeground(Color.decode("#FFCC33"));

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Main.frame.menuWindow.setVisible(false);
                Main.frame.searchBookWindow.setVisible(true);
            }
        });

        add(searchButton);
*/

        exitButton=new JButton("Exit");
        exitButton.setBounds(100,160,300,30);
        exitButton.setBackground(Color.DARK_GRAY);
        exitButton.setForeground(Color.decode("#FFCC33"));

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        add(exitButton);

    }
}

