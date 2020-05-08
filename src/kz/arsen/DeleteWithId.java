package kz.arsen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class DeleteWithId extends Container {
    private JLabel enterIdLabel;

    private JTextField idPlaceText;

    private JButton enterButton;
    private JButton backButton;

    public DeleteWithId(){
        setSize(500,600);
        setLayout(null);

        enterIdLabel =new JLabel("Enter ID");
        enterIdLabel.setBounds(90,60,60,30);
        enterIdLabel.setForeground(Color.DARK_GRAY);
        add(enterIdLabel);


        idPlaceText =new JTextField();
        idPlaceText.setBounds(150,60,150,30);
        idPlaceText.setBackground(Color.DARK_GRAY);
        idPlaceText.setForeground(Color.decode("#FFCC33"));
        idPlaceText.setCaretColor(Color.RED);
        add(idPlaceText);


        enterButton=new JButton("Enter");
        enterButton.setBounds(90,140,100,30);
        enterButton.setBackground(Color.DARK_GRAY);
        enterButton.setForeground(Color.decode("#FFCC33"));

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ///
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
                Main.frame.adminMenuWindow.setVisible(true);
                Main.frame.deleteWithIdWindow.setVisible(false);
            }
        });
        add(backButton);




    }

}
