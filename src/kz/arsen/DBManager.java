package kz.arsen;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

public class DBManager {
    private Connection connection;
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/final?useUnicode=true&serverTimezone=UTC","root", ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addClient(Client client){
        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO `clients`(`id`, `name`, `surname`, `login`, `password`, `email`) " +
                    "VALUES (NULL, ?, ?, ?, ?, ?)"
            );
            statement.setString(1, client.getName());
            statement.setString(2, client.getSurname());
            statement.setString(3, client.getLogin());
            statement.setString(4, client.getPassword());
            statement.setString(5,client.getEmail());
            int rows = statement.executeUpdate();// Insert, Delete, Update

            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Client> getAllClients(){
        ArrayList<Client> clientList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM `clients`");
            ResultSet resultSet = statement.executeQuery();/// Select

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String login = resultSet.getString("login");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                clientList.add(new Client(id, name, surname, login, password,email));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clientList;
    }

    /*
    public void deleteStudent(Integer id){
        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "DELETE FROM student WHERE id = ?"
            );
            statement.setInt(1, id);
            int rows = statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }*/
}

/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
    private Connection connection;
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");///
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/final?useUnicode=true&serverTimezone=UTC","root", ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addStudent(Student student){
        try{

            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO student (id, name, surname, faculty, groups) " +
                    "VALUES (NULL, ?, ?, ?, ?)"
            );
            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setString(3, student.getFaculty());
            statement.setString(4, student.getGroup());

            statement.executeUpdate();// Insert, Delete, Update

            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Student> getAllStudents(){
        ArrayList<Student> studentList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM student");
            ResultSet resultSet = statement.executeQuery();/// Select

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String faculty = resultSet.getString("faculty");
                String group = resultSet.getString("groups");

                studentList.add(new Student(id, name, surname, faculty, group));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return studentList;
    }
    //// CRUD: Create(Insert into), Read(Select), Update, Delete
}
*/
