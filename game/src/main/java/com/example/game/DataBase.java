package com.example.game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase {
    public String saveUser(String name , String password , int numberMap) throws ClassNotFoundException {
        try {
            String URL = "jdbc:mysql://localhost/mayagame";
            String nameServer = "root";
            String passwordServer = "123";
            Class.forName("com.mysql.cj.jdbc.Driver"); // connect to database
            Connection connection = DriverManager.getConnection(URL, nameServer, passwordServer);
            String command = String.format("INSERT INTO information (username , password , level , map , win , lose ) " +
                    "VALUES ('%s' , '%s' , '%d', '%d', '%d', '%d')" , name,password,1,numberMap,0,0);
            Statement statement = connection.prepareStatement(command);
            statement.execute(command);  // send info to database
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error in save User!!!   --> " + e.getMessage();
        }
        return "You are saved:)";
    }


    public String checkUserName(String username){
        try {
            String URL = "jdbc:mysql://localhost/mayagame";
            String nameServer = "root";
            String passwordServer = "123";
            Class.forName("com.mysql.cj.jdbc.Driver"); // connect to database
            Connection connection = DriverManager.getConnection(URL, nameServer, passwordServer);
            String sql = "SELECT username FROM `information`;";
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                if(rs.equals(username)){
                    return "We have this username in our game !! ";
                }
            }
        }
        catch (Exception e){

        }
        return "checked";
    }



    public String updateLevel(String username , int level){
        try {
            String URL = "jdbc:mysql://localhost/mayagame";
            String nameServer = "root";
            String passwordServer = "123";
            Class.forName("com.mysql.cj.jdbc.Driver"); // connect to database
            Connection connection = DriverManager.getConnection(URL, nameServer, passwordServer);
            String sql =String.format( "UPDATE `information` SET level='%d' WHERE username='%s'" , level ,username );
            Statement s = connection.prepareStatement(sql);
            s.execute(sql);
        }
        catch (Exception e){
            return "we could not update the level ! ";

        }
        return "updated!";
    }

}
