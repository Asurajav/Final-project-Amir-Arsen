package kz.arsen;


import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static MainMenu menuWindow;
    public static AdminLogin adminloginWindow;
    public static Login loginWindow;
    public static Registration registrationWindow;
    public static SearchBook searchBookWindow;
    public static ReadOnline readOnlineWindow;
    public static AdminMenu adminMenuWindow;
    public static DeleteWithId deleteWithIdWindow;

    public MainFrame(){
        getContentPane().setBackground( Color.decode("#808080") );
        setSize(500,800);
        setTitle("LIBRARY KZO TDK");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuWindow=new MainMenu();
        menuWindow.setLocation(0,0);
        add(menuWindow);

        adminloginWindow=new AdminLogin();
        adminloginWindow.setLocation(0,0);
        adminloginWindow.setVisible(false);
        add(adminloginWindow);

        loginWindow=new Login();
        loginWindow.setLocation(0,0);
        loginWindow.setVisible(false);
        add(loginWindow);

        registrationWindow=new Registration();
        registrationWindow.setLocation(0,0);
        registrationWindow.setVisible(false);
        add(registrationWindow);

        searchBookWindow=new SearchBook();
        searchBookWindow.setLocation(0,0);
        searchBookWindow.setVisible(false);
        add(searchBookWindow);

        readOnlineWindow=new ReadOnline();
        readOnlineWindow.setLocation(0,0);
        readOnlineWindow.setVisible(false);
        add(readOnlineWindow);

        adminMenuWindow=new AdminMenu();
        adminMenuWindow.setLocation(0,0);
        adminMenuWindow.setVisible(false);
        add(adminMenuWindow);

        deleteWithIdWindow=new DeleteWithId();
        deleteWithIdWindow.setLocation(0,0);
        deleteWithIdWindow.setVisible(false);
        add(deleteWithIdWindow);



    }


}
