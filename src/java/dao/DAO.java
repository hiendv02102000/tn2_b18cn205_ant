/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
/**
 *
 * @author admin
 */
public class DAO {

    protected Connection conn;

    public DAO() {
        try {
            final String HostName = "127.0.0.1";
            final String DBName = "pet_spa";
            final String UserName = "root";
            final String Password = "123456";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionURL = "jdbc:mysql://" + HostName + ":3307/" + DBName + "?zeroDateTimeBehavior=convertToNull";
            this.conn = DriverManager.getConnection(connectionURL, UserName, Password);
        } catch (Exception e) {
            e.printStackTrace();
            this.conn = null;
        }
    }
}
