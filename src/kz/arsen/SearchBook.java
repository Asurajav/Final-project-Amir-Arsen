package kz.arsen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SearchBook extends Container {
    private JButton readOnlineButton;
    private JButton orderOnlineButton;
    private JButton backButton;


    public SearchBook(){
        setSize(500,600);
        setLayout(null);


        readOnlineButton=new JButton("Read Online");
        readOnlineButton.setBounds(90,90,300,30);
        readOnlineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(readOnlineButton);

        orderOnlineButton=new JButton("order");
        orderOnlineButton.setBounds(90,130,300,30);
        orderOnlineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ///
            }
        });
        add(orderOnlineButton);

        backButton=new JButton("Back");
        backButton.setBounds(90,170,300,30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.searchBookWindow.setVisible(false);
                Main.frame.adminloginWindow.setVisible(true);
            }
        });
        add(backButton);
 /*JButton searchButton = new JButton("Search Book");////Amir мынау search Button сонын коды
        searchButton.setBounds(100, 160, 300, 30);
        searchButton.setBackground(Color.DARK_GRAY);
        searchButton.setForeground(Color.decode("#FFCC33"));

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        add(searchButton);
*/
    }
}
