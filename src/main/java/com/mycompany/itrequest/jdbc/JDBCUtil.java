/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itrequest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author default
 */
public class JDBCUtil {
    private static String url= "jdbc:mysql://localhost:3306/VBoxData";
    private static String uid= "root";
    private static String password="root";
    
    
    public static Connection getConnection(){
        Connection con= null;
        try{
            con= DriverManager.getConnection(url, uid, password);
            System.out.println("Ket noi thanh cong den CSDL");
            
        }catch(SQLException e){
            System.out.println("Loi ket noi "+ e.getMessage());
        }
        return con;
    }
}
