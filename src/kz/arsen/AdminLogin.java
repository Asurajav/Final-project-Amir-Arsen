package kz.arsen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLogin extends Container {
    private JLabel loginLabel;
    private JLabel passwordLabel;

    private JTextField loginText;
    private JTextField passwordText;


    private JButton enterButton;
    private JButton backButton;
    //setBackground(Color.DARK_GRAY);
    //setForeground(Color.decode("#FFCC33"));
    public AdminLogin(){
        setSize(500,600);
        setLayout(null);

        loginLabel =new JLabel("Login");
        loginLabel.setBounds(90,60,60,30);
        loginLabel.setForeground(Color.DARK_GRAY);
        add(loginLabel);


        loginText =new JTextField();
        loginText.setBounds(150,60,150,30);
        loginText.setBackground(Color.DARK_GRAY);
        loginText.setForeground(Color.decode("#FFCC33"));
        loginText.setCaretColor(Color.RED);
        add(loginText);


        passwordLabel=new JLabel("Password");
        passwordLabel.setBounds(90,100,60,30);
        passwordLabel.setForeground(Color.DARK_GRAY);
        add(passwordLabel);

        passwordText =new JTextField();
        passwordText.setBounds(150,100,150,30);
        passwordText.setBackground(Color.DARK_GRAY);
        passwordText.setForeground(Color.decode("#FFCC33"));
        passwordText.setCaretColor(Color.RED);
        add(passwordText);


        enterButton=new JButton("Enter");
        enterButton.setBounds(90,140,100,30);
        enterButton.setBackground(Color.DARK_GRAY);
        enterButton.setForeground(Color.decode("#FFCC33"));

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(loginText.getText().equals("admin")&& passwordText.getText().equals("admin123")){
                   Main.frame.adminMenuWindow.setVisible(true);
                   Main.frame.adminloginWindow.setVisible(false);
               }
               else{
                   loginText.setText("");
                   passwordText.setText("");
               }
                loginText.setText("");
                passwordText.setText("");
            }
        });
        add(enterButton);

        backButton=new JButton("Back");
        backButton.setBounds(200,140,100,30);
        backButton.setBackground(Color.DARK_GRAY);
        backButton.setForeground(Color.decode("#FFCC33"));

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.adminloginWindow.setVisible(false);
            }
        });
        add(backButton);




    }


}
