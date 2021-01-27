/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppenjualanbuku;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
import java.awt.*;
        
public class JualBuku extends javax.swing.JFrame {
    
    DefaultTableModel tabModel;
    ResultSet RsTokoBuku=null;
    
    
    public JualBuku() {
        initComponents();
        
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize=this.getSize();
        if(frameSize.height > screenSize.height){
        frameSize.height=screenSize.height;
        }
        if(frameSize.width > screenSize.width){
        frameSize.width=screenSize.width;
        }
        this.setLocation((screenSize.width - frameSize.width) / 2,
        (screenSize.height = screenSize.height) / 20); 
        
        //fungsi Tampil data dan set edit off dijalankan saat aplikasi di run
        tampilData();
        SetEditOff();
    }
    
    private void tampilData(){
        try{
            Object[] penjualanbuku = {"id", "Nama", "Judul_Buku", "Nama_Buku", "Stok_Buku", "Harga_Buku","Tanggal","Alamat"};
            tabModel=new DefaultTableModel(null,penjualanbuku);
            jTable1.setModel(tabModel);
            
            Connection conn=(Connection)Koneksi.koneksiDB;
            Statement stt=conn.createStatement();
            tabModel.getDataVector().removeAllElements();
            
            RsTokoBuku=stt.executeQuery("SELECT * from tokobuku ");  
            while(RsTokoBuku.next()){
                Object[] data={
                    RsTokoBuku.getString("id"),
                    RsTokoBuku.getString("Nama"),
                    RsTokoBuku.getString("Judul_Buku"),
                    RsTokoBuku.getString("Nama_Buku"),
                    RsTokoBuku.getString("Stok_Buku"),
                    RsTokoBuku.getString("Harga_Buku"),
                    RsTokoBuku.getString("Tanggal"),
                    RsTokoBuku.getString("Alamat")
                };
               tabModel.addRow(data);
            }                
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
        }
        // disable button
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
    }
    
       void tblKeForm(){
        jTextField1.setText(tabModel.getValueAt(jTable1.getSelectedRow(),0)+"");
        jTextField2.setText(tabModel.getValueAt(jTable1.getSelectedRow(),1)+"");
        jTextField3.setText(tabModel.getValueAt(jTable1.getSelectedRow(),2)+"");
        jTextField4.setText(tabModel.getValueAt(jTable1.getSelectedRow(),3)+"");
        jTextField5.setText(tabModel.getValueAt(jTable1.getSelectedRow(),4)+"");
        jTextField6.setText(tabModel.getValueAt(jTable1.getSelectedRow(),5)+"");
        jTextField7.setText(tabModel.getValueAt(jTable1.getSelectedRow(),6)+"");
        jTextField8.setText(tabModel.getValueAt(jTable1.getSelectedRow(),7)+"");
        
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(false);
        jButton5.setEnabled(true);
    }
       
        private void BersihData(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText(""); 
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
    }
        
        private void SetEditOff(){
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(false);
        jTextField5.setEnabled(false);
        jTextField6.setEnabled(false);
        jTextField7.setEnabled(false);
        jTextField8.setEnabled(false);    
   }
        
         private void seteditOn(){
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(true);
        jTextField3.setEnabled(true);
        jTextField4.setEnabled(true);
        jTextField5.setEnabled(true);
        jTextField6.setEnabled(true);
        jTextField7.setEnabled(true);
        jTextField8.setEnabled(true);
   }
         
         

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id :");

        jLabel2.setText("Nama : ");

        jLabel3.setText("Judul Buku : ");

        jLabel4.setText("Nama Buku : ");

        jLabel5.setText("Stok Buku : ");

        jLabel6.setText("Harga Buku : ");

        jLabel7.setText("Tanggal : ");

        jLabel8.setText("Alamat : ");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");

        jTextField7.setText("jTextField7");

        jTextField8.setText("jTextField8");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Simpan");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Batal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(jTextField3)
                                .addComponent(jTextField4)
                                .addComponent(jTextField5)
                                .addComponent(jTextField6)
                                .addComponent(jTextField7))
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       BersihData();
        jTextField1.requestFocus();
        jButton4.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        seteditOn();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String id=jTextField1.getText();
        String Nama=jTextField2.getText();
        String Judul_Buku=jTextField3.getText();
        String Nama_Buku=jTextField4.getText();
        String Stok_Buku=jTextField5.getText();
        String Harga_Buku=jTextField6.getText();
        String Tanggal=jTextField7.getText();
        String Alamat=jTextField8.getText();
        
        java.util.Date tanggal = new java.util.Date();
        java.text.SimpleDateFormat TanggalFormat= new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String CreateDate=TanggalFormat.format(tanggal);
        
        if (id.isEmpty() ) {
            JOptionPane.showMessageDialog(null,"id tidak boleh kosong");
            jTextField1.requestFocus();
        }else if (Nama.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Nama tidak boleh kosong");
            jTextField2.requestFocus();
        }else if (Judul_Buku.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Judul Buku tidak boleh kosong");
            jTextField3.requestFocus();
        }else if (Nama_Buku.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Nama Buku tidak boleh kosong");
            jTextField4.requestFocus();
        }else if (Stok_Buku.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Stok Buku tidak boleh kosong");
            jTextField5.requestFocus();
        }else if (Harga_Buku.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Harga Buku tidak boleh kosong");
            jTextField6.requestFocus();
        }else if (Tanggal.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Tanggal tidak boleh kosong");
            jTextField7.requestFocus();
        }else if (Alamat.isEmpty()) {
            JOptionPane.showMessageDialog(null,"ALamat tidak boleh kosong");
            jTextField8.requestFocus();
        }
        else if (!(new Scanner(Harga_Buku).hasNextInt())) {
            JOptionPane.showMessageDialog(null,"Harga Buku harus ada angka");
            jTextField6.requestFocus();
        }else if (!(new Scanner(Stok_Buku).hasNextInt())) {
            JOptionPane.showMessageDialog(null,"Stok Buku harus ada angka");
            jTextField5.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed
        else {
           try{
                Connection conn=(Connection)Koneksi.koneksiDB();
                Statement stt=conn.createStatement();
                stt.executeUpdate("insert into tokobuku(id,Nama,Judul_Buku,Nama_Buku,Stok_Buku,Harga_Buku,Tanggal,Alamat)"+
                    "VALUES('"+id+"','"+Nama+"','"+Judul_Buku+"','"+Nama_Buku+"','"+Stok_Buku+"','"+Harga_Buku+"','"+Tanggal+"','"+Alamat+"')");
                BersihData();
                tampilData();
                SetEditOff();
                JOptionPane.showMessageDialog(this,"Data berhasil disimpan","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Simpan data gagal\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        } 
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id=jTextField1.getText();
        String Nama=jTextField2.getText();
        String Judul_Buku=jTextField3.getText();
        String Nama_Buku=jTextField4.getText();
        String Stok_Buku=jTextField5.getText();
        String Harga_Buku=jTextField6.getText();
        String Tanggal=jTextField7.getText();
        String Alamat=jTextField8.getText();
        
        java.util.Date tanggal = new java.util.Date();
        java.text.SimpleDateFormat TanggalFormat= new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String CreateDate=TanggalFormat.format(tanggal);
        
        if (id.isEmpty() ) {
            JOptionPane.showMessageDialog(null,"id tidak boleh kosong");
            jTextField1.requestFocus();
        }else if (Nama.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Nama tidak boleh kosong");
            jTextField2.requestFocus();
        }else if (Judul_Buku.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Judul Buku tidak boleh kosong");
            jTextField3.requestFocus();
        }else if (Nama_Buku.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Nama Buku tidak boleh kosong");
            jTextField4.requestFocus();
        }else if (Stok_Buku.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Stok Buku tidak boleh kosong");
            jTextField5.requestFocus();
        }else if (Harga_Buku.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Harga Buku tidak boleh kosong");
            jTextField6.requestFocus();
        }else if (Tanggal.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Tanggal tidak boleh kosong");
            jTextField7.requestFocus();
        }else if (Alamat.isEmpty()) {
            JOptionPane.showMessageDialog(null,"ALamat tidak boleh kosong");
            jTextField8.requestFocus();
        }
        else if (!(new Scanner(Harga_Buku).hasNextInt())) {
            JOptionPane.showMessageDialog(null,"Harga Buku harus ada angka");
            jTextField6.requestFocus();
        }else if (!(new Scanner(Stok_Buku).hasNextInt())) {
            JOptionPane.showMessageDialog(null,"Stok Buku harus ada angka");
            jTextField5.requestFocus();
    }                                        
        else {
           try{
                Connection conn=(Connection)Koneksi.Koneksi();
                Statement stt=conn.createStatement();
                stt.executeUpdate("insert into tokobuku(id,Nama,Judul_Buku,Nama_Buku,Stok_Buku,Harga_Buku,Tanggal,Alamat)"+
                    "VALUES('"+id+"','"+Nama+"','"+Judul_Buku+"','"+Nama_Buku+"','"+Stok_Buku+"','"+Harga_Buku+"','"+Tanggal+"','"+Alamat+"')");
                BersihData();
                tampilData();
                SetEditOff();
                JOptionPane.showMessageDialog(this,"Data berhasil disimpan","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Simpan data gagal\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String id=jTextField1.getText();

        if (id.isEmpty() ) {
            JOptionPane.showMessageDialog(null,"Kode produk tidak boleh kosong");
            jTextField1.requestFocus();
        }else if(JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan menghapus data ini?",
            "Informasi",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE)==JOptionPane.OK_OPTION){
        try{
            Connection conn=(Connection)Koneksi.Koneksi();
            Statement stt=conn.createStatement();
            stt.executeUpdate("DELETE FROM tokobuku WHERE id='"+id+"'");
            BersihData();
            tampilData();
            SetEditOff();
            JOptionPane.showMessageDialog(this,"Data berhasil di hapus","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Delete data gagal\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        BersihData();
        jButton4.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        SetEditOff();
    }//GEN-LAST:event_jButton5ActionPerformed
   
    private void jTable1Clicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        seteditOn();
        jTextField1.setEnabled(false);
        tblKeForm();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JualBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JualBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JualBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JualBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
