/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpvg2.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author victorqribeiro
 */
public class Conect {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/mydb?useSSL=false";
    static final String USER = "root";
    static final String PASS = "";
    //static final String PASS = "root";
    //static final String PASS = "123456";

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;

        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);

        return conn;
    }
}
