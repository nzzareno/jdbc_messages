package com.platzi.mensajes_app;

public class Main {
    public static void main(String[] args) {
        try {
            MyConnection myConnection = new MyConnection();
            myConnection.getConnection();
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
    }
}
