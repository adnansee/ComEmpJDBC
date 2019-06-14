package be.intec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {


    private Connection connection;
    private static ConnectionProvider instance = new ConnectionProvider();

    public static ConnectionProvider getInstance() {
        return instance;
    }

    public Connection getConnection() {

    if(connection == null){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/comapany_demo","root","");
        } catch (SQLException e) {
            e.printStackTrace();
                    }
    }
        return connection;
    }

}
