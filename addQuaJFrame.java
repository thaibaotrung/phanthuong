/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bai5cnpm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oOOo
 */
public class addQuaJFrame extends javax.swing.JFrame {
    private DefaultTableModel tblModel;
    /**
     * Creates new form phatqua
     */
    public addQuaJFrame() {
        initComponents();
        initTableModel();
        initComboBox();
    }
    
     private void initTableModel(){
        String[] columnNames = new String[]{"ID nhân khẩu","Họ và tên", "Tuổi",};
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(columnNames);
        tbdanhsach.setModel(tblModel);
    }
     
     
     public void resetForm(){
         txtidnhankhau.setText("");
        txthoTen.setText("");
        txttuoi.setText("");
    }
     
      private void initComboBox(){
        try{
            String url = "jdbc:mysql://localhost/quan_ly_nhan_khau";
        var user = "root";
        var password = "";
             Connection con = DriverManager.getConnection(url, user, password);
             String sql = "select tenphanthuong from phan_thuong ";
             PreparedStatement pstmt = con.prepareStatement(sql);
              ResultSet rs = pstmt.executeQuery();
              boxqua.removeAllItems();
              while(rs.next()){
                  boxqua.addItem(rs.getString("TENSACH"));
              }
        }
        catch(Exception e){
             e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbdanhsach = new javax.swing.JTable();
        btnThongKe = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txthoTen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttuoi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        boxqua = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtidnhankhau = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbdanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID nhân khẩu", "Họ và tên", "Tuổi"
            }
        ));
        tbdanhsach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdanhsachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdanhsach);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 375, 187));

        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        getContentPane().add(btnThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 387, -1, -1));

        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        jLabel1.setText("Họ và tên");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));
        getContentPane().add(txthoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 150, -1));

        jLabel2.setText("Tuổi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));
        getContentPane().add(txttuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 150, -1));

        jLabel3.setText("Phần quà");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        btnInsert.setText("Thêm mới");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        boxqua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(boxqua, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jLabel4.setText("ID nhân khẩu");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        txtidnhankhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidnhankhauActionPerformed(evt);
            }
        });
        getContentPane().add(txtidnhankhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
         try{
           String url = "jdbc:mysql://localhost/quan_ly_nhan_khau";
        var user = "root";
        var password = "";
             Connection con = DriverManager.getConnection(url, user, password);
            String sql = "select ID, hoTen, ROUND(Datediff(CURDATE(), namSinh)/365,0) as tuoi from nhan_khau where ROUND(Datediff(CURDATE(), namSinh)/365,0) <= 18";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            tblModel.setRowCount(0);
            while(rs.next()){
                tblModel.addRow(new Object[]{
                    rs.getInt("ID"),
                rs.getString("hoTen"),
                rs.getString("tuoi"),
            });
            }
            tblModel.fireTableDataChanged();
            }
         catch(Exception e){
            e.printStackTrace();
                JOptionPane.showMessageDialog(this, e.getMessage());
        }    
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:mysql://localhost/quan_ly_nhan_khau";
        var user = "root";
        var password = "";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(addQuaJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
             try{
            quaService q = new quaService();
            q.setId(Integer.parseInt(txtidnhankhau.getText()));
            q.setHoTen(txthoTen.getText());
            q.setTuoi(Integer.parseInt(txttuoi.getText()));
            q.setTenqua(boxqua.getSelectedItem().toString());
            addQuaController dao = new addQuaController();
            dao.insert(q);
           
            JOptionPane.showMessageDialog(this, "Lưu thành công");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void tbdanhsachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdanhsachMouseClicked
        // TODO add your handling code here:
        int row = tbdanhsach.getSelectedRow();
        String id = tbdanhsach.getValueAt(row, 0).toString();
        String hoTen = tbdanhsach.getValueAt(row, 1).toString();
        String tuoi = tbdanhsach.getValueAt(row, 2).toString();
        
        txtidnhankhau.setText(id);
        txthoTen.setText(hoTen);
        txttuoi.setText(tuoi);
    }//GEN-LAST:event_tbdanhsachMouseClicked

    private void txtidnhankhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidnhankhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidnhankhauActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(addQuaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addQuaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addQuaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addQuaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addQuaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxqua;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbdanhsach;
    private javax.swing.JTextField txthoTen;
    private javax.swing.JTextField txtidnhankhau;
    private javax.swing.JTextField txttuoi;
    // End of variables declaration//GEN-END:variables
}