/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.itrequest;

import com.mycompany.itrequest.jdbc.JDBCUtil;
import java.sql.Connection;

/**
 *
 * @author default
 */
public class ITRequest {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Connection con= JDBCUtil.getConnection();
    }
}
