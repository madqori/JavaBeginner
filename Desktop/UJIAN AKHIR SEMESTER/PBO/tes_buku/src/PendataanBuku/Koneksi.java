/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PendataanBuku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    Connection Connect = null;
    /** Creates a new instance of Koneksi */
    public Koneksi() {
        
    }
    
    public Connection DatabaseToko() {
    //Mencoba memanggil Driver JDBC
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                String Url = "jdbc:mysql://localhost:3306/PBcopy";
                String User = "root";
                String Password = "tulungaku";
                Connect = DriverManager.getConnection(Url,User,Password);
            }
            // Gagal Koneksi dengan Database
            catch (SQLException se) {
                JOptionPane.showMessageDialog(null,"Tidak bisa akses ke database.... : "+se);
                System.exit(0);
            }
        }
        // Gagal Memanggil Driver JDBC
        catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null,"Driver database rusak.... : "+cnfe);
            System.exit(0);
        }
        return Connect;
    } // methode koneksiDatabase()
}