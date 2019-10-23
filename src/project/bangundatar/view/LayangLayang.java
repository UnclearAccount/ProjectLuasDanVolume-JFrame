package project.bangundatar.view;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import project.bangundatar.controller.CLayangLayang;
import project.main.MainMenu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catur Rahmat
 */
public class LayangLayang extends javax.swing.JFrame {

    /**
     * Creates new form Square
     */
    public LayangLayang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PersegiPanjang = new javax.swing.JPanel();
        LblMassukandiagonal = new javax.swing.JLabel();
        IDiagonal1 = new javax.swing.JTextField();
        BtnReset = new javax.swing.JButton();
        BtnHitung = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        LblMassukanDiagonal2 = new javax.swing.JLabel();
        IDiagonal2 = new javax.swing.JTextField();
        LblKeliling = new javax.swing.JLabel();
        LblLuas = new javax.swing.JLabel();
        OKeliling = new javax.swing.JTextField();
        OLuas = new javax.swing.JTextField();
        LblHasil = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        NetbeansLogo = new javax.swing.JLabel();
        JavaLogo = new javax.swing.JLabel();
        CaturRahmat = new javax.swing.JLabel();
        YoffanAlfiatur = new javax.swing.JLabel();
        AlexMasrobi = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PoweredBy = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ISisi2 = new javax.swing.JTextField();
        ISisi1 = new javax.swing.JTextField();
        LblMassukanSisi1 = new javax.swing.JLabel();
        LblMassukanSisi2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PersegiPanjang.setBackground(new java.awt.Color(102, 153, 255));
        PersegiPanjang.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "KALKULATOR LAYANG LAYANG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        PersegiPanjang.setFocusable(false);
        PersegiPanjang.setRequestFocusEnabled(false);
        PersegiPanjang.setVerifyInputWhenFocusTarget(false);

        LblMassukandiagonal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LblMassukandiagonal.setText("Massukan Diagonal 1 ");

        IDiagonal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDiagonal1ActionPerformed(evt);
            }
        });

        BtnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/Clear-icon.png"))); // NOI18N
        BtnReset.setText("  Reset");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        BtnHitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/calculator-icon.png"))); // NOI18N
        BtnHitung.setText("Hitung");
        BtnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHitungActionPerformed(evt);
            }
        });

        BtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/Go-back-icon.png"))); // NOI18N
        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        LblMassukanDiagonal2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LblMassukanDiagonal2.setText("Massukan Diagonal 2 ");

        IDiagonal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDiagonal2ActionPerformed(evt);
            }
        });

        LblKeliling.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LblKeliling.setText("Keliling");

        LblLuas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LblLuas.setText("Luas");

        OKeliling.setEditable(false);
        OKeliling.setBackground(new java.awt.Color(204, 204, 204));
        OKeliling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKelilingActionPerformed(evt);
            }
        });

        OLuas.setEditable(false);
        OLuas.setBackground(new java.awt.Color(204, 204, 204));
        OLuas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OLuasActionPerformed(evt);
            }
        });

        LblHasil.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        LblHasil.setForeground(new java.awt.Color(255, 255, 255));
        LblHasil.setText("HASIL PERHITUNGAN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        NetbeansLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/netbeans-icon.png"))); // NOI18N

        JavaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/Java-icon.png"))); // NOI18N

        CaturRahmat.setText("Catur Rahmat 124180026");

        YoffanAlfiatur.setText("Yoffan Alfiatur R 124180025");

        AlexMasrobi.setText("Alex Masrobi 124180029");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/Upnlogo.jpg"))); // NOI18N

        PoweredBy.setText("Created by : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PoweredBy, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaturRahmat)
                .addGap(80, 80, 80)
                .addComponent(YoffanAlfiatur)
                .addGap(89, 89, 89)
                .addComponent(AlexMasrobi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NetbeansLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JavaLogo)
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JavaLogo))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(CaturRahmat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(YoffanAlfiatur, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(AlexMasrobi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PoweredBy, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(NetbeansLogo))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/Filesystem-blockdevice-cubes-icon.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/rsz_2karkulator.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/rsz_logo_upn.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        ISisi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISisi2ActionPerformed(evt);
            }
        });

        ISisi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISisi1ActionPerformed(evt);
            }
        });

        LblMassukanSisi1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LblMassukanSisi1.setText("Massukan Sisi M 1 ");

        LblMassukanSisi2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LblMassukanSisi2.setText("Massukan Sisi M 2");

        javax.swing.GroupLayout PersegiPanjangLayout = new javax.swing.GroupLayout(PersegiPanjang);
        PersegiPanjang.setLayout(PersegiPanjangLayout);
        PersegiPanjangLayout.setHorizontalGroup(
            PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersegiPanjangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersegiPanjangLayout.createSequentialGroup()
                        .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblMassukandiagonal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblKeliling)
                            .addComponent(LblLuas)
                            .addComponent(LblMassukanDiagonal2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblMassukanSisi1)
                            .addComponent(LblMassukanSisi2))
                        .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PersegiPanjangLayout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(BtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PersegiPanjangLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PersegiPanjangLayout.createSequentialGroup()
                                        .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ISisi2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(PersegiPanjangLayout.createSequentialGroup()
                                                .addGap(255, 255, 255)
                                                .addComponent(LblHasil)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE)
                                        .addComponent(BtnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)
                                        .addGap(46, 46, 46))
                                    .addGroup(PersegiPanjangLayout.createSequentialGroup()
                                        .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(OKeliling)
                                            .addComponent(OLuas, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(IDiagonal1)
                                            .addComponent(ISisi1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(IDiagonal2))
                                        .addGap(128, 128, 128))))))
                    .addGroup(PersegiPanjangLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(243, 243, 243)
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22))
                    .addGroup(PersegiPanjangLayout.createSequentialGroup()
                        .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PersegiPanjangLayout.setVerticalGroup(
            PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersegiPanjangLayout.createSequentialGroup()
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersegiPanjangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDiagonal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblMassukandiagonal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblMassukanDiagonal2)
                    .addComponent(IDiagonal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ISisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblMassukanSisi1))
                .addGap(9, 9, 9)
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersegiPanjangLayout.createSequentialGroup()
                        .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ISisi2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblMassukanSisi2)
                            .addComponent(BtnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(LblHasil))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19)
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblKeliling))
                .addGap(32, 32, 32)
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OLuas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblLuas))
                .addGap(34, 34, 34)
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PersegiPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PersegiPanjang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IDiagonal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDiagonal1ActionPerformed
        
    }//GEN-LAST:event_IDiagonal1ActionPerformed

    private void IDiagonal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDiagonal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDiagonal2ActionPerformed

    private void OKelilingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKelilingActionPerformed
        
    }//GEN-LAST:event_OKelilingActionPerformed

    private void OLuasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OLuasActionPerformed
        
    }//GEN-LAST:event_OLuasActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
    //Btn Reset
    IDiagonal2.setText(" ");
    IDiagonal1.setText(" ");
    OKeliling.setText(" ");
    OLuas.setText(" ");
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
    //BtnBack
    MainMenu menu;
    menu = new MainMenu();
    menu.setVisible(true);
    this.dispose(); 
    }//GEN-LAST:event_BtnBackActionPerformed

    private void ISisi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISisi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISisi2ActionPerformed

    private void ISisi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISisi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISisi1ActionPerformed

    private void BtnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHitungActionPerformed
        try{   
        String TmpDiagonal1 = IDiagonal1.getText();
        String TmpDiagonal2 = IDiagonal2.getText();
        String TmpSisi1 = ISisi1.getText();
        String TmpSisi2 = ISisi2.getText();
        double diagonal1 = Double.parseDouble(TmpDiagonal1);
        double diagonal2 = Double.parseDouble(TmpDiagonal2);
        double sisi1 = Double.parseDouble(TmpSisi1);
        double sisi2 = Double.parseDouble(TmpSisi2);
        CLayangLayang cLayangLayang = new CLayangLayang(diagonal1, diagonal2, sisi1, sisi2);
        cLayangLayang.keliling();
        cLayangLayang.luas();
        double Tmpkeliling = cLayangLayang.getKeliling(); 
        String keliling = Double.toString(Tmpkeliling);
        OKeliling.setText(keliling);
        double Tmpluas = cLayangLayang.getLuas();   
        String luas = Double.toString(Tmpluas);
        OLuas.setText(luas);
        }catch (NumberFormatException check){
            JOptionPane.showMessageDialog(this, "Input Salah, Please Try Again","ERROR!!!",JOptionPane.WARNING_MESSAGE);
            IDiagonal2.setText(" ");
    IDiagonal1.setText(" ");
    OKeliling.setText(" ");
    OLuas.setText(" ");
        }
   catch (InputMismatchException check2){
            JOptionPane.showMessageDialog(this, "Input Melebihi Max, Please Try Again","ERROR!!!",JOptionPane.WARNING_MESSAGE);
            IDiagonal2.setText(" ");
    IDiagonal1.setText(" ");
    OKeliling.setText(" ");
    OLuas.setText(" ");
        }
    }//GEN-LAST:event_BtnHitungActionPerformed

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
            java.util.logging.Logger.getLogger(LayangLayang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LayangLayang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LayangLayang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LayangLayang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LayangLayang().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlexMasrobi;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnHitung;
    private javax.swing.JButton BtnReset;
    private javax.swing.JLabel CaturRahmat;
    private javax.swing.JTextField IDiagonal1;
    private javax.swing.JTextField IDiagonal2;
    private javax.swing.JTextField ISisi1;
    private javax.swing.JTextField ISisi2;
    private javax.swing.JLabel JavaLogo;
    private javax.swing.JLabel LblHasil;
    private javax.swing.JLabel LblKeliling;
    private javax.swing.JLabel LblLuas;
    private javax.swing.JLabel LblMassukanDiagonal2;
    private javax.swing.JLabel LblMassukanSisi1;
    private javax.swing.JLabel LblMassukanSisi2;
    private javax.swing.JLabel LblMassukandiagonal;
    private javax.swing.JLabel NetbeansLogo;
    private javax.swing.JTextField OKeliling;
    private javax.swing.JTextField OLuas;
    private javax.swing.JPanel PersegiPanjang;
    private javax.swing.JLabel PoweredBy;
    private javax.swing.JLabel YoffanAlfiatur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
