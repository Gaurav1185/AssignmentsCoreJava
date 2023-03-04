package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1  {
    public static void main(String[] args) throws Exception{


    String url="jdbc:mysql:///Java_programs";// file location including folder
    String username="root";//my username,
    String password="root";// pass for username
//    try
//
//    {
        //statement which statement should be given exception

        Connection connection = DriverManager.getConnection(url,username,password);//getConnection is static method which accept url,username,password
        String query="INSERT INTO student(1,2,3)";
        Statement statement=connection.createStatement();//3rd step
        statement.executeUpdate(query);
//    }catch (SQLException e); {
//        System.out.println(e.getMessage());
//        System.out.println("Invalid Credentials");

    }
}
