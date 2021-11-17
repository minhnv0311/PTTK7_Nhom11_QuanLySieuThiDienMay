/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DAO {
    public static Connection con;
     
    public DAO(){
        if(con == null){
            String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=xxx";
 
            try {
                con = DriverManager.getConnection (dbUrl, "sa", "xxx");
            }
            catch(SQLException e) {
                
            }
        }
    }
}
