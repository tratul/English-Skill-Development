/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author PritomD
 */
class mySqlConnect {
    Connection conn = null;
    
    public static Connection ConnectDB()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/english_skill?zeroDateTimeBehavior=convertToNull","root","");
            JOptionPane.showMessageDialog(null, "DataBase connected ");
            
            return con;
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
