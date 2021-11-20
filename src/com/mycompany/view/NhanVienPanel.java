/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.duan1.X.XImage;
import com.mycompany.duan1.dao.NhanVienDao;
import com.mycompany.duan1.model.NhanVien;
import com.mycompany.duan1.model.SinhVien;
import java.awt.Color;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import scrollbar.ScrollBarCustom;

/**
 *
 * @author quang
 */
public class NhanVienPanel extends javax.swing.JPanel {

    /**
     * Creates new form NhanVienPanel
     */
    public NhanVienPanel() {
        initComponents();
        load();
        fixTable();
    }
    NhanVienDao dao = new NhanVienDao();
    NhanVien nv = new NhanVien();
    int row = -1;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblhinh = new javax.swing.JLabel();
        Scrollbar = new javax.swing.JScrollPane();
        tblNhanVien = new rojeru_san.complementos.RSTableMetro();
        txtMaNV2 = new textfield.MaNhanVien();
        txtHoTen1 = new textfield.TenNhanVien();
        txtSoDT1 = new textfield.SDT();
        txtEmail = new textfield.Email();
        txtDiaChi = new textfield.DiaChi();
        jdcNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtMaCN1 = new textfield.MaChuyenNganh();
        txttimkiem = new textfield.TìmKiếm();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();

        setBorder(new javax.swing.border.MatteBorder(null));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)), "THÔNG TIN NHÂN VIÊN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ẢNH");

        lblhinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhinhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblhinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblhinh, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 190));

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "Số điện thoại", "Email", "Địa chỉ", "Ngày Sinh", "Giới Tính", "Mã CN", "Hình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        tblNhanVien.setColorBordeFilas(new java.awt.Color(153, 153, 153));
        tblNhanVien.setColorBordeHead(new java.awt.Color(153, 153, 153));
        tblNhanVien.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblNhanVien.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblNhanVien.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblNhanVien.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblNhanVien.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblNhanVien.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblNhanVien.setRowHeight(45);
        tblNhanVien.getTableHeader().setReorderingAllowed(false);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        Scrollbar.setViewportView(tblNhanVien);

        jPanel1.add(Scrollbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 1080, 340));
        jPanel1.add(txtMaNV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 240, -1));
        jPanel1.add(txtHoTen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 240, -1));
        jPanel1.add(txtSoDT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 240, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 230, -1));
        jPanel1.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 230, -1));

        jdcNgaySinh.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(jdcNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 230, -1));

        jLabel1.setText("Ngày Sinh");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Delete.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 100, 40));

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Refresh.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 110, 40));

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 100, 40));

        btnLamMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Properties.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 110, 40));

        rdoNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");
        jPanel1.add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        rdoNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");
        rdoNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNuActionPerformed(evt);
            }
        });
        jPanel1.add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 50, -1));

        jLabel3.setText("Giới Tính");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));
        jPanel1.add(txtMaCN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 220, -1));

        txttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemActionPerformed(evt);
            }
        });
        jPanel1.add(txttimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 220, -1));

        rSButtonHover1.setBackground(new java.awt.Color(204, 0, 51));
        rSButtonHover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Search.png"))); // NOI18N
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
   if(evt.getClickCount()==2){   
            row = tblNhanVien.getSelectedRow();
            edit();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
insert();        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
update();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
delete();        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
Reset();        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void lblhinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhinhMouseClicked
chonAnh();        // TODO add your handling code here:
    }//GEN-LAST:event_lblhinhMouseClicked

    private void rdoNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNuActionPerformed

    private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemActionPerformed

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        loadByMa();        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover1ActionPerformed
 void load(){
         DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
            model.setRowCount(0);
        try {
            List<NhanVien> list = dao.selectAll();
            for (NhanVien nv : list) {
                Object[] row = {
                    nv.getMaNhanVien(),
                    nv.getTenNhanVien(),
                    nv.getSDT(),
                    nv.getEmail(),
                    nv.getDiaChi(),
                    nv.getNgaySinh(),
                    nv.isGioiTinh(),
                    nv.getMaChuyenNganh(),
                    nv.getHinh()               
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }
 void loadByMa(){
     try {
         DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
            model.setRowCount(0);
        String MaNV = txttimkiem.getText();
        List<NhanVien> list =  dao.selectByMaNV(MaNV);
        for (NhanVien nv : list) {
                Object[] row = {
                    nv.getMaNhanVien(),
                    nv.getTenNhanVien(),
                    nv.getSDT(),
                    nv.getEmail(),
                    nv.getDiaChi(),
                    nv.getNgaySinh(),
                    nv.isGioiTinh(),
                    nv.getMaChuyenNganh(),
                    nv.getHinh()               
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }
     void insert(){
          NhanVien nv1 = getForm();
        try {        
        dao.insert(nv1);    
        load();
        JOptionPane.showMessageDialog(this, "Thêm thành công");
        } catch (Exception e) {    
            e.printStackTrace();
        }  
    }
     NhanVien getForm(){
        NhanVien nv  = new NhanVien();
        nv.setMaNhanVien(txtMaNV2.getText());
        nv.setTenNhanVien(txtHoTen1.getText());
        nv.setSDT(txtSoDT1.getText());
        nv.setEmail(txtEmail.getText());
        nv.setNgaySinh(jdcNgaySinh.getDate());
        nv.setDiaChi(txtDiaChi.getText());
        nv.setGioiTinh(rdoNam.isSelected());
        nv.setMaChuyenNganh(txtMaCN1.getText());
        nv.setHinh(lblhinh.getToolTipText());
      
        return nv;
        
    }
     void edit(){
        String MaNhanVien = (String) tblNhanVien.getValueAt(row, 0);
        NhanVien nv = dao.selectById(MaNhanVien);
        setForm(nv);
    }
    void setForm(NhanVien nv){
         txtMaNV2.setText(nv.getMaNhanVien());
         txtHoTen1.setText(nv.getTenNhanVien());
         txtSoDT1.setText(nv.getSDT());
         txtEmail.setText(nv.getEmail());
         txtDiaChi.setText(nv.getDiaChi());
         txtMaCN1.setText(nv.getMaChuyenNganh());
         if(nv.getHinh()!= null){
             lblhinh.setToolTipText(nv.getHinh());
             lblhinh.setIcon(XImage.read(nv.getHinh()));
         }else{
             lblhinh.setIcon(XImage.read("noImage.png"));    
         }
        jdcNgaySinh.setDate(nv.getNgaySinh());
        rdoNam.setSelected(!nv.isGioiTinh());
        rdoNu.setSelected(nv.isGioiTinh());
    }
    
    
    void delete(){
        String MaNhanVien = txtMaNV2.getText();
        try {
            dao.delete(MaNhanVien);
            load();
         JOptionPane.showMessageDialog(this, "Xoá thành công");
            
        } catch (Exception e) {
         JOptionPane.showMessageDialog(this, "Xoá thất bại");
        }
    }
    
    
    
    JFileChooser fileChooser = new JFileChooser();
    void chonAnh() {
        if(fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            XImage.save(file); // lưu hình vào thư mục logos
            ImageIcon icon = XImage.read(file.getName()); // đọc hình từ logos
            lblhinh.setIcon(icon);
            lblhinh.setToolTipText(file.getName()); // giữ tên hình trong tooltip
        }
    }
    
     void update(){
        NhanVien model = getmodel();
        try {
            dao.update(model);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            load();
        } catch (Exception e) {
          e.printStackTrace();
        }
    }
    NhanVien getmodel(){
        NhanVien model = new NhanVien();
        model.setMaNhanVien(txtMaNV2.getText());
        model.setTenNhanVien(txtHoTen1.getText());
        model.setSDT(txtSoDT1.getText());
        model.setEmail(txtEmail.getText());
        model.setDiaChi(txtDiaChi.getText());
        model.setNgaySinh(jdcNgaySinh.getDate());
        model.setGioiTinh(rdoNam.isSelected()? true : false);
        model.setMaChuyenNganh(txtMaCN1.getText());
        model.setHinh(lblhinh.getToolTipText());
        return model;
    }
    void Reset(){
        txtMaNV2.setText("");
        txtHoTen1.setText("");
        txtSoDT1.setText("");
        txtEmail.setText("");
        txtDiaChi.setText("");
        jdcNgaySinh.setDateFormatString("");
        rdoNam.isSelected();
        txtMaCN1.setText("");
        lblhinh.setText("");
        
    }
    void fixTable(){
        Scrollbar.getViewport().setBackground(Color.WHITE);
        Scrollbar.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        Scrollbar.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        Scrollbar.setBorder(new EmptyBorder(5, 10, 5, 10));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scrollbar;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdcNgaySinh;
    private javax.swing.JLabel lblhinh;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private rojeru_san.complementos.RSTableMetro tblNhanVien;
    private textfield.DiaChi txtDiaChi;
    private textfield.Email txtEmail;
    private textfield.TenNhanVien txtHoTen1;
    private textfield.MaChuyenNganh txtMaCN1;
    private textfield.MaNhanVien txtMaNV2;
    private textfield.SDT txtSoDT1;
    private textfield.TìmKiếm txttimkiem;
    // End of variables declaration//GEN-END:variables
}