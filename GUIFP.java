/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guifp;

/**
 *
 * @author ACER
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class GUIFP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/guifp";
            String user = "root";
            String password = "";
            
            conn = DriverManager.getConnection(url, user, password);
                    if (conn != null) {
                        System.out.println("Connected to the Database!");
                    } else {
                        System.out.println("Failed to make connection!");
                    } 
        }catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                conn.close();
                }
            } catch (SQLException e) {
                System.err.println("error closing connection: " + e.getMessage());
                }
        }
        Estropees hm = new Estropees();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        hm.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
    }
}
    
