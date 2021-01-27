/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppenjualanbuku;

import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi extends javax.swing.JFrame {

    private Connection koneksi;
    
    public Koneksi() {
        initComponents();
        KoneksiDatabase();
    }

     private void KoneksiDatabase() {
        try {
        Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException cnf) {
        }
         try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/dbmahasiswa", "root", "");
            JOptionPane.showMessageDialog(null, "Koneksi Database Berhasil");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Tidak Berhasil");
            } catch (Exception e) {
        }
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
