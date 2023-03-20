package Practise.StringHandling.OOPS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcConnection {
public static final String query="INSERT INTO NEWPROGRAMS VALUES(?,?,?)";
    public static void main(String[] args) throws Exception
    {
        String url="jdbc:mysql:///NEWPROGRAMS";//how to find this url
        String  username="root";
        String password="root";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your first Number");
        int numberOne=scanner.nextInt();
        System.out.println("Enter Your Second Number");
        int secondNumber=scanner.nextInt();
        int result=numberOne+secondNumber;

        Class.forName("com.mysql.cj.jdbc.Driver");//this url how

        Connection connection= DriverManager.getConnection(url,username,password);
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setInt(1,numberOne);
        preparedStatement.setInt(2,secondNumber);
        preparedStatement.setInt(3,result);

       int result01= preparedStatement.executeUpdate();

        if(result01==0)
            System.out.println("Record is not save");
        else
            System.out.println("Record is saved"+result01);

        System.out.println("result of two numbers is "+result);
    }
}
