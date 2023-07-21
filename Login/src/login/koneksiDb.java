/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author RPL-3
 */
public class koneksiDb {
    Connection koneksi=null;
     public static Connection koneksi() {
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection             koneksi    =DriverManager.getConnection("jdbc:mysql://localhost/dapii", "root", "");
             return koneksi;
         }catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
             return null;
         }
     }
    
}
