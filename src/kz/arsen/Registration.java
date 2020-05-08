package kz.arsen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration extends Container {


    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel loginLabel;
    private JLabel passwordLabel;
    private JLabel emailLabel;


    private JTextField nameText;
    private JTextField surnameText;
    private JTextField loginText;
    private JTextField passwordText;
    private JTextField emailText;

    private JButton backButton;
    private JButton regButton;


    public Registration(){
        setSize(500,600);
        setLayout(null);

////name
        nameLabel=new JLabel("Name:");
        nameLabel.setBounds(90,60,60,30);
        add(nameLabel);

        nameText=new JTextField();
        nameText.setBounds(150,60,150,30);
        add(nameText);

///surname
        surnameLabel=new JLabel("Surname:");
        surnameLabel.setBounds(90,100,60,30);
        add(surnameLabel);

        surnameText=new JTextField();
        surnameText.setBounds(150,100,150,30);
        add(surnameText);

///login
        loginLabel=new JLabel("New login:");
        loginLabel.setBounds(90,140,60,30);
        add(loginLabel);

        loginText=new JTextField();
        loginText.setBounds(150,140,150,30);
        add(loginText);

///password
        passwordLabel=new JLabel("New password");
        passwordLabel.setBounds(90,180,60,30);
        add(passwordLabel);

        passwordText=new JTextField();
        passwordText.setBounds(150,180,150,30);
        add(passwordText);
///E-mail
      emailLabel=new JLabel("E-Mail");
      emailLabel.setBounds(90,220,60,30);
        add(emailLabel);

        emailText=new JTextField();
        emailText.setBounds(150,220,150,30);
        add(emailText);
///reg
        regButton=new JButton("Reg");
        regButton.setBounds(90,260,100,30);
        regButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String name=nameText.getText();
               String surname=surnameText.getText();
               String login=loginText.getText();
               String password=passwordText.getText();
               String email=emailText.getText();

               Client client=new Client(null,name,surname,login,password,email);
               PackageData pd=new PackageData("Reg",client);
               Main.connect(pd);


               nameText.setText("");
               surnameText.setText("");
               loginText.setText("");
               passwordText.setText("");
               emailText.setText("");

            }
        });
        add(regButton);

///back
        backButton=new JButton("Back");
        backButton.setBounds(200,260,100,30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.registrationWindow.setVisible(false);
            }
        });
        add(backButton);


    }

}
