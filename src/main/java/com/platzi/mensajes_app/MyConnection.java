package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    public Connection getConnection(){
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "");
            if (connection != null){
                System.out.println("Conexión exitosa");
            }
        }  catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }


}
