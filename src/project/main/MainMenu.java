package project.main;


import java.awt.FlowLayout;
import static java.awt.FlowLayout.CENTER;
import project.bangundatar.view.Trapesium;
import project.bangundatar.view.Segitiga;
import project.bangundatar.view.PersegiPanjang;
import project.bangundatar.view.Persegi;
import project.bangundatar.view.Lingkaran;
import project.bangundatar.view.LayangLayang;
import project.bangundatar.view.BelahKetupat;
import project.bangundatar.view.JajarGenjang;
import project.bangunruang.view.Balok;
import project.bangunruang.view.Bola;
import project.bangunruang.view.Kerucut;
import project.bangunruang.view.KerucutTerpancung;
import project.bangunruang.view.Kubus;
import project.bangunruang.view.Limas;
import project.bangunruang.view.Prisma;
import project.bangunruang.view.Tabung;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catur Rahmat
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        MainMenu = new javax.swing.JPanel();
        ForLogo = new javax.swing.JLabel();
        Judul = new javax.swing.JLabel();
        Garis = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Persegi = new javax.swing.JButton();
        PersegiPanjang = new javax.swing.JButton();
        Segitiga = new javax.swing.JButton();
        LayangLayang = new javax.swing.JButton();
        BelahKetupat = new javax.swing.JButton();
        Lingkaran = new javax.swing.JButton();
        Trapesium = new javax.swing.JButton();
        BJajarGenjang = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        NetbeansLogo = new javax.swing.JLabel();
        JavaLogo = new javax.swing.JLabel();
        CaturRahmat = new javax.swing.JLabel();
        YoffanAlfiatur = new javax.swing.JLabel();
        AlexMasrobi = new javax.swing.JLabel();
        CaturRahmat1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Balok = new javax.swing.JButton();
        Tabung = new javax.swing.JButton();
        Kubus = new javax.swing.JButton();
        Prisma = new javax.swing.JButton();
        Kerucut = new javax.swing.JButton();
        Bola = new javax.swing.JButton();
        Limas = new javax.swing.JButton();
        KerucutTerpancung = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Garis1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setFocusTraversalPolicyProvider(true);
        setResizable(false);

        MainMenu.setBackground(new java.awt.Color(165, 224, 243));
        MainMenu.setFocusable(false);
        MainMenu.setPreferredSize(new java.awt.Dimension(868, 570));
        MainMenu.setRequestFocusEnabled(false);
        MainMenu.setVerifyInputWhenFocusTarget(false);

        ForLogo.setBackground(new java.awt.Color(51, 255, 0));
        ForLogo.setFont(new java.awt.Font("Vivaldi", 3, 24)); // NOI18N
        ForLogo.setForeground(new java.awt.Color(0, 102, 255));
        ForLogo.setText("For Geometry and Two Dimension ");

        Judul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/rsz_2karkulator.png"))); // NOI18N

        Garis.setBackground(new java.awt.Color(255, 255, 0));
        Garis.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout GarisLayout = new javax.swing.GroupLayout(Garis);
        Garis.setLayout(GarisLayout);
        GarisLayout.setHorizontalGroup(
            GarisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        GarisLayout.setVerticalGroup(
            GarisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/rsz_logo_upn.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Persegi.setBackground(new java.awt.Color(102, 204, 255));
        Persegi.setText("PERSEGI");
        Persegi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Persegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersegiActionPerformed(evt);
            }
        });

        PersegiPanjang.setBackground(new java.awt.Color(102, 204, 255));
        PersegiPanjang.setText("PERSEGI PANJANG");
        PersegiPanjang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PersegiPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersegiPanjangActionPerformed(evt);
            }
        });

        Segitiga.setBackground(new java.awt.Color(102, 204, 255));
        Segitiga.setText("SEGITIGA");
        Segitiga.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Segitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegitigaActionPerformed(evt);
            }
        });

        LayangLayang.setBackground(new java.awt.Color(102, 204, 255));
        LayangLayang.setText("LAYANG LAYANG");
        LayangLayang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LayangLayang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LayangLayangActionPerformed(evt);
            }
        });

        BelahKetupat.setBackground(new java.awt.Color(102, 204, 255));
        BelahKetupat.setText("BELAH KETUPAT");
        BelahKetupat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BelahKetupat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BelahKetupatActionPerformed(evt);
            }
        });

        Lingkaran.setBackground(new java.awt.Color(102, 204, 255));
        Lingkaran.setText("LINGKARAN");
        Lingkaran.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LingkaranActionPerformed(evt);
            }
        });

        Trapesium.setBackground(new java.awt.Color(102, 204, 255));
        Trapesium.setText("TRAPESIUM");
        Trapesium.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Trapesium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrapesiumActionPerformed(evt);
            }
        });

        BJajarGenjang.setBackground(new java.awt.Color(102, 204, 255));
        BJajarGenjang.setText("JAJAR GENJANG");
        BJajarGenjang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BJajarGenjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJajarGenjangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Lingkaran, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(BJajarGenjang, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LayangLayang, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Segitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Persegi, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PersegiPanjang, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(BelahKetupat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Trapesium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersegiPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Persegi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BelahKetupat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Segitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LayangLayang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Trapesium, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lingkaran, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BJajarGenjang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));

        NetbeansLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/netbeans-icon.png"))); // NOI18N

        JavaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/Java-icon.png"))); // NOI18N

        CaturRahmat.setText("Catur Rahmat 124180026");

        YoffanAlfiatur.setText("Yoffan Alfiatur R 124180025");

        AlexMasrobi.setText("Alex Masrobi 124180029");

        CaturRahmat1.setText("Created by :");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/Upnlogo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CaturRahmat1)
                .addGap(18, 18, 18)
                .addComponent(CaturRahmat)
                .addGap(94, 94, 94)
                .addComponent(YoffanAlfiatur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AlexMasrobi)
                .addGap(103, 103, 103)
                .addComponent(NetbeansLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JavaLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(2, 2, 2))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(CaturRahmat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(YoffanAlfiatur, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(AlexMasrobi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CaturRahmat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NetbeansLogo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(JavaLogo))))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Balok.setBackground(new java.awt.Color(51, 153, 255));
        Balok.setText("BALOK");
        Balok.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Balok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalokActionPerformed(evt);
            }
        });

        Tabung.setBackground(new java.awt.Color(51, 153, 255));
        Tabung.setText("TABUNG");
        Tabung.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tabung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabungActionPerformed(evt);
            }
        });

        Kubus.setBackground(new java.awt.Color(51, 153, 255));
        Kubus.setText("KUBUS");
        Kubus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Kubus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KubusActionPerformed(evt);
            }
        });

        Prisma.setBackground(new java.awt.Color(51, 153, 255));
        Prisma.setText("PRISMA");
        Prisma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Prisma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrismaActionPerformed(evt);
            }
        });

        Kerucut.setBackground(new java.awt.Color(51, 153, 255));
        Kerucut.setText("KERUCUT");
        Kerucut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Kerucut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KerucutActionPerformed(evt);
            }
        });

        Bola.setBackground(new java.awt.Color(51, 153, 255));
        Bola.setText("BOLA");
        Bola.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BolaActionPerformed(evt);
            }
        });

        Limas.setBackground(new java.awt.Color(51, 153, 255));
        Limas.setText("LIMAS");
        Limas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Limas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimasActionPerformed(evt);
            }
        });

        KerucutTerpancung.setBackground(new java.awt.Color(51, 153, 255));
        KerucutTerpancung.setText("KERUCUT TERPANCUNG");
        KerucutTerpancung.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        KerucutTerpancung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KerucutTerpancungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bola, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(Kubus, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                            .addComponent(Balok, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Prisma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Tabung, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                            .addGap(52, 52, 52)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Limas, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Kerucut, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(KerucutTerpancung, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kubus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Balok, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kerucut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tabung, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Prisma, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bola, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KerucutTerpancung, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/Filesystem-blockdevice-cubes-icon.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/Categories-system-help-icon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setText("About this Application?");

        Garis1.setBackground(new java.awt.Color(0, 204, 0));
        Garis1.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout Garis1Layout = new javax.swing.GroupLayout(Garis1);
        Garis1.setLayout(Garis1Layout);
        Garis1Layout.setHorizontalGroup(
            Garis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Garis1Layout.setVerticalGroup(
            Garis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MainMenuLayout = new javax.swing.GroupLayout(MainMenu);
        MainMenu.setLayout(MainMenuLayout);
        MainMenuLayout.setHorizontalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Judul)
                .addGap(224, 224, 224)
                .addComponent(Logo)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Garis, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Garis1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                        .addComponent(ForLogo)
                        .addGap(264, 264, 264))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38))))
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                        .addComponent(Logo)
                        .addGap(18, 18, 18))
                    .addComponent(Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(Garis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Garis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(ForLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(884, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PersegiPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersegiPanjangActionPerformed
    PersegiPanjang persegiPanjang;
    persegiPanjang = new PersegiPanjang();
    persegiPanjang.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_PersegiPanjangActionPerformed

    private void TabungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabungActionPerformed
    Tabung tabung;
    tabung = new Tabung();
    tabung.setVisible(true);
    this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_TabungActionPerformed

    private void SegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegitigaActionPerformed
    Segitiga segitiga;
    segitiga = new Segitiga();
    segitiga.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_SegitigaActionPerformed

    private void PersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersegiActionPerformed
      Persegi persegi;
    persegi = new Persegi();
    persegi.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_PersegiActionPerformed

    private void BelahKetupatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BelahKetupatActionPerformed
    BelahKetupat belahKetupat;
    belahKetupat = new BelahKetupat();
    belahKetupat.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_BelahKetupatActionPerformed

    private void LayangLayangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LayangLayangActionPerformed
    LayangLayang layangLayang;
    layangLayang = new LayangLayang();
    layangLayang.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_LayangLayangActionPerformed

    private void TrapesiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrapesiumActionPerformed
    Trapesium trapesium;
    trapesium = new Trapesium();
    trapesium.setVisible(true);
    this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_TrapesiumActionPerformed

    private void LingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LingkaranActionPerformed
    Lingkaran lingkaran;
    lingkaran = new Lingkaran();
    lingkaran.setVisible(true);
    this.dispose();      
        // TODO add your handling code here:
    }//GEN-LAST:event_LingkaranActionPerformed

    private void BalokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalokActionPerformed
    Balok balok;
    balok = new Balok();
    balok.setVisible(true);
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_BalokActionPerformed

    private void KubusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KubusActionPerformed
    Kubus kubus;
    kubus = new Kubus();
    kubus.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_KubusActionPerformed

    private void BolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BolaActionPerformed
    Bola bola;
    bola = new Bola();
    bola.setVisible(true);
    this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_BolaActionPerformed

    private void PrismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrismaActionPerformed
    Prisma prismaSegitiga;
    prismaSegitiga = new Prisma();
    prismaSegitiga.setVisible(true);
    this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_PrismaActionPerformed

    private void LimasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimasActionPerformed
    Limas limas;
    limas = new Limas();
    limas.setVisible(true);
    this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_LimasActionPerformed

    private void KerucutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KerucutActionPerformed
    Kerucut kerucut;
    kerucut = new Kerucut();
    kerucut.setVisible(true);
    this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_KerucutActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Bantuan bantuan;
        bantuan = new Bantuan();
        bantuan.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void BJajarGenjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJajarGenjangActionPerformed
        JajarGenjang jajarGenjang;
        jajarGenjang = new JajarGenjang();
        jajarGenjang.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BJajarGenjangActionPerformed

    private void KerucutTerpancungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KerucutTerpancungActionPerformed
    KerucutTerpancung kerucutTerpancung;
    kerucutTerpancung = new KerucutTerpancung();
    kerucutTerpancung.setVisible(true);
    this.dispose();
    
    }//GEN-LAST:event_KerucutTerpancungActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainMenu menu = new MainMenu();
                menu.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlexMasrobi;
    private javax.swing.JButton BJajarGenjang;
    private javax.swing.JButton Balok;
    private javax.swing.JButton BelahKetupat;
    private javax.swing.JButton Bola;
    private javax.swing.JLabel CaturRahmat;
    private javax.swing.JLabel CaturRahmat1;
    private javax.swing.JLabel ForLogo;
    private javax.swing.JPanel Garis;
    private javax.swing.JPanel Garis1;
    private javax.swing.JLabel JavaLogo;
    private javax.swing.JLabel Judul;
    private javax.swing.JButton Kerucut;
    private javax.swing.JButton KerucutTerpancung;
    private javax.swing.JButton Kubus;
    private javax.swing.JButton LayangLayang;
    private javax.swing.JButton Limas;
    private javax.swing.JButton Lingkaran;
    private javax.swing.JLabel Logo;
    public javax.swing.JPanel MainMenu;
    private javax.swing.JLabel NetbeansLogo;
    private javax.swing.JButton Persegi;
    private javax.swing.JButton PersegiPanjang;
    private javax.swing.JButton Prisma;
    private javax.swing.JButton Segitiga;
    private javax.swing.JButton Tabung;
    private javax.swing.JButton Trapesium;
    private javax.swing.JLabel YoffanAlfiatur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
