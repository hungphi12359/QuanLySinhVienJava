/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;
import java.sql.PreparedStatement;
import com.mycompany.duan1.X.DatabaseConnection;
import com.mycompany.duan1.model.LichHoc;
import com.mycompany.duan1.model.MonHoc;
import java.sql.ResultSet;
import java.util.Date;
/**
 *
 * @author ADMIN
 */
public class AddLichHoc extends javax.swing.JFrame {

    /**
     * Creates new form ThongKeDuLieuJFrameForm
     */
private LichHocJPanel lichHocJPanel;
    public AddLichHoc() {
  
        initComponents();
//    lichHocJPanel = (LichHocJPanel) parent;
    }

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtmalophoc = new javax.swing.JTextField();
        txtthoigian = new javax.swing.JTextField();
        txtmamonhoc = new javax.swing.JTextField();
        txtmaphonghoc = new javax.swing.JTextField();
        txtmachuyennnganh = new javax.swing.JTextField();
        txtmanhanvien = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rSButtonPane1 = new rojeru_san.complementos.RSButtonPane();
        jLabel9 = new javax.swing.JLabel();
        rSButtonPane2 = new rojeru_san.complementos.RSButtonPane();
        jLabel10 = new javax.swing.JLabel();
        rSButtonPane3 = new rojeru_san.complementos.RSButtonPane();
        jLabel12 = new javax.swing.JLabel();
        rSButtonPane4 = new rojeru_san.complementos.RSButtonPane();
        jLabel11 = new javax.swing.JLabel();
        jdcNgay = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtmalophoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 290, -1));
        jPanel1.add(txtthoigian, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, -1));
        jPanel1.add(txtmamonhoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 290, -1));
        jPanel1.add(txtmaphonghoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 290, -1));
        jPanel1.add(txtmachuyennnganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 290, -1));
        jPanel1.add(txtmanhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 290, -1));

        jLabel1.setText("Mã Phòng Học");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        jLabel2.setText("Ngày");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setText("Thời Gian");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setText("Mã Môn Học");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setText("Mã Lớp Học");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel6.setText("Mã Chuyên Ngành");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        jLabel7.setText("Mã Nhân Viên");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("THÊM LỊCH HỌC");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        rSButtonPane1.setToolTipText("");
        rSButtonPane1.setName(""); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("THÊM");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rSButtonPane1Layout = new javax.swing.GroupLayout(rSButtonPane1);
        rSButtonPane1.setLayout(rSButtonPane1Layout);
        rSButtonPane1Layout.setHorizontalGroup(
            rSButtonPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        rSButtonPane1Layout.setVerticalGroup(
            rSButtonPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(rSButtonPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("XÓA");

        javax.swing.GroupLayout rSButtonPane2Layout = new javax.swing.GroupLayout(rSButtonPane2);
        rSButtonPane2.setLayout(rSButtonPane2Layout);
        rSButtonPane2Layout.setHorizontalGroup(
            rSButtonPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        rSButtonPane2Layout.setVerticalGroup(
            rSButtonPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(rSButtonPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 100, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("LÀM MỚI");

        javax.swing.GroupLayout rSButtonPane3Layout = new javax.swing.GroupLayout(rSButtonPane3);
        rSButtonPane3.setLayout(rSButtonPane3Layout);
        rSButtonPane3Layout.setHorizontalGroup(
            rSButtonPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        rSButtonPane3Layout.setVerticalGroup(
            rSButtonPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(rSButtonPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 100, -1));

        rSButtonPane4.setToolTipText("");
        rSButtonPane4.setName(""); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CẬP NHẬT");

        javax.swing.GroupLayout rSButtonPane4Layout = new javax.swing.GroupLayout(rSButtonPane4);
        rSButtonPane4.setLayout(rSButtonPane4Layout);
        rSButtonPane4Layout.setHorizontalGroup(
            rSButtonPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        rSButtonPane4Layout.setVerticalGroup(
            rSButtonPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(rSButtonPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 100, -1));
        jPanel1.add(jdcNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    LichHoc getForm(){
        LichHoc nv  = new LichHoc();
        nv.setNgay(jdcNgay.getDate());
        nv.setThoiGian(txtthoigian.getText());
        nv.setMaMonHoc(txtmamonhoc.getText());
        nv.setMaLopHoc(txtmalophoc.getText());
        nv.setMaChuyenNganh(txtmachuyennnganh.getText());
        nv.setMaNhanVien(txtmanhanvien.getText());
        nv.setMaPhongHoc(txtmaphonghoc.getText());
 return nv;
        
    }
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
            java.util.logging.Logger.getLogger(AddLichHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLichHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLichHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLichHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLichHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdcNgay;
    private rojeru_san.complementos.RSButtonPane rSButtonPane1;
    private rojeru_san.complementos.RSButtonPane rSButtonPane2;
    private rojeru_san.complementos.RSButtonPane rSButtonPane3;
    private rojeru_san.complementos.RSButtonPane rSButtonPane4;
    private javax.swing.JTextField txtmachuyennnganh;
    private javax.swing.JTextField txtmalophoc;
    private javax.swing.JTextField txtmamonhoc;
    private javax.swing.JTextField txtmanhanvien;
    private javax.swing.JTextField txtmaphonghoc;
    private javax.swing.JTextField txtthoigian;
    // End of variables declaration//GEN-END:variables
}