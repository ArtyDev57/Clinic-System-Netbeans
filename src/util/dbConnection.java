/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author arty
 */
public class dbConnection {
    
    public static Connection getDatabase(){
        try {
            String url = "jdbc:mysql://localhost:8889/dbClinic?"+
                    "useUnicode=true&characterEncoding=UTF-8";
            String username = "nuol-lab";
            String password = "webapp18";
            String driver = "com.mysql.jdbc.Driver";
            
            Class.forName(driver);
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e){
            e.getMessage();
        }
        
        return null;
    }
    
    public static void main(String[] args){
        Connection c = getDatabase();
        if (c==null){
            System.out.println("Failed");
        } else {
            System.out.println("Success");
        }
        
    }
    
}
