package com.example.search_engine_ashish;

import java.sql.*;

public class DatabaseConnection {

    String mySqlUrl = "jdbc:mysql://localhost:3306/Search_Engine_Ashish?useSSL=false";
    String DatabaseUserName = "root";
    String DatabasePassword = "1234567890";

    Connection conn = null;
    //create a constructor for starting the database server
    DatabaseConnection() throws SQLException {
        conn = DriverManager.getConnection(mySqlUrl, DatabaseUserName, DatabasePassword);
        System.out.println("Connection to the Database is successful");
    }

    public ResultSet executeQuery(String query) throws SQLException {
        // for reading
        ResultSet ans = null;
        Statement statement = conn.createStatement();
        ans = statement.executeQuery(query); // here are taking the query from the user only

        return ans;
    }

    public int executeUpdate(String query) throws SQLException {
        //this must be an update query or write query
        int ans = 0;
        Statement statement = conn.createStatement();
        ans = statement.executeUpdate(query); //and this method is for updating the query or write query

        return ans;
    }
}
