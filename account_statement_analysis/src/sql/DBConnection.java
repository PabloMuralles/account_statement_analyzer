/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

/**
 *
 * @author pablo
 */

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {
    Connection conn = null;
    private String url = "jdbc:postgresql://localhost/account_statement_analysis";
    private String user = "postgres";
    private String password = "admin123";
    
    
    public void StartConnection(){
        try {
            // user the dravier
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url,user,password);
            //JOptionPane.showMessageDialog(null, "Connection successful", "Connection", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Connection successful");
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Connection failed" + e, "Connection", JOptionPane.ERROR_MESSAGE);
            System.out.println("Connection failed" + e.toString());
        }
    }
    
    public void CloseConnection(){
        try {
            conn.close();
            System.out.println("Connection Closed");
        } catch (Exception e) {
            System.out.println("Can't Close de DB" + e.toString());
        }
    }

}

