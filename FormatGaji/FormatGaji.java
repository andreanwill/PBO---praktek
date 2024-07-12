/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormatGaji;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab-J2-01
 */
public class FormatGaji extends javax.swing.JFrame {

    /**
     * Creates new form FormatGaji
     */
    public FormatGaji() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        PanelIdentitas = new javax.swing.JPanel();
        LabelNama = new javax.swing.JLabel();
        LabelNIK = new javax.swing.JLabel();
        LabelGolongan = new javax.swing.JLabel();
        LabelJK = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNIK = new javax.swing.JTextField();
        txtJamKerja = new javax.swing.JTextField();
        cbGolongan = new javax.swing.JComboBox<>();
        ButtonHitung = new javax.swing.JButton();
        PanelRincian = new javax.swing.JPanel();
        LabelGapok = new javax.swing.JLabel();
        LabelUpah = new javax.swing.JLabel();
        txtGapok = new javax.swing.JTextField();
        txtUpah = new javax.swing.JTextField();
        LabelTotUpah = new javax.swing.JLabel();
        txtTotUpah = new javax.swing.JTextField();
        LabelTotGaji = new javax.swing.JLabel();
        txtTotGaji = new javax.swing.JTextField();
        ButtonDesk = new javax.swing.JButton();
        ButtonReset = new javax.swing.JButton();
        ButtonExit = new javax.swing.JButton();
        LabelJudul = new javax.swing.JLabel();
        PanelKeterangan = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaKet = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelIdentitas.setBackground(new java.awt.Color(255, 255, 255));
        PanelIdentitas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identitas Pegawai", 0, 0, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 51))); // NOI18N

        LabelNama.setText("Nama Pegawai");

        LabelNIK.setText("NIK");

        LabelGolongan.setText("Golongan");

        LabelJK.setText("Jam Kerja");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        cbGolongan.setBackground(new java.awt.Color(204, 204, 204));
        cbGolongan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilihan Golongan", "Golongan 1", "Golongan 2", "Golongan 3", "Golongan 4" }));
        cbGolongan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGolonganActionPerformed(evt);
            }
        });

        ButtonHitung.setBackground(new java.awt.Color(204, 204, 204));
        ButtonHitung.setText("Hitung Gaji");
        ButtonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelIdentitasLayout = new javax.swing.GroupLayout(PanelIdentitas);
        PanelIdentitas.setLayout(PanelIdentitasLayout);
        PanelIdentitasLayout.setHorizontalGroup(
            PanelIdentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIdentitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelIdentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelNama, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(LabelNIK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelGolongan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelJK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelIdentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelIdentitasLayout.createSequentialGroup()
                        .addComponent(ButtonHitung)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNama)
                    .addComponent(txtNIK)
                    .addComponent(txtJamKerja)
                    .addComponent(cbGolongan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelIdentitasLayout.setVerticalGroup(
            PanelIdentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIdentitasLayout.createSequentialGroup()
                .addGroup(PanelIdentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelIdentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNIK)
                    .addComponent(txtNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelIdentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelGolongan)
                    .addComponent(cbGolongan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelIdentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelJK)
                    .addComponent(txtJamKerja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonHitung)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        PanelRincian.setBackground(new java.awt.Color(255, 255, 255));
        PanelRincian.setBorder(javax.swing.BorderFactory.createTitledBorder("Rincian Gaji"));

        LabelGapok.setText("Gaji Pokok");

        LabelUpah.setText("Upah per jam");

        txtGapok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGapokActionPerformed(evt);
            }
        });

        LabelTotUpah.setText("Total Upah");

        LabelTotGaji.setText("Total Gaji");

        ButtonDesk.setBackground(new java.awt.Color(204, 204, 204));
        ButtonDesk.setText("Deskripsi");
        ButtonDesk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeskActionPerformed(evt);
            }
        });

        ButtonReset.setBackground(new java.awt.Color(204, 204, 204));
        ButtonReset.setText("Reset");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });

        ButtonExit.setBackground(new java.awt.Color(204, 204, 204));
        ButtonExit.setText("Exit");
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRincianLayout = new javax.swing.GroupLayout(PanelRincian);
        PanelRincian.setLayout(PanelRincianLayout);
        PanelRincianLayout.setHorizontalGroup(
            PanelRincianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRincianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRincianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelRincianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LabelTotGaji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelTotUpah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelGapok, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelUpah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                    .addGroup(PanelRincianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ButtonDesk)
                        .addComponent(ButtonReset)
                        .addComponent(ButtonExit)))
                .addGap(18, 18, 18)
                .addGroup(PanelRincianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGapok, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(txtUpah)
                    .addComponent(txtTotUpah)
                    .addComponent(txtTotGaji))
                .addContainerGap())
        );
        PanelRincianLayout.setVerticalGroup(
            PanelRincianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRincianLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelRincianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelGapok)
                    .addComponent(txtGapok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelRincianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUpah)
                    .addComponent(txtUpah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelRincianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTotUpah)
                    .addComponent(txtTotUpah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelRincianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTotGaji)
                    .addComponent(txtTotGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(ButtonDesk)
                .addGap(18, 18, 18)
                .addComponent(ButtonReset)
                .addGap(18, 18, 18)
                .addComponent(ButtonExit)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        LabelJudul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelJudul.setText("PENGGAJI KARYAWAN PT ABC");

        PanelKeterangan.setBackground(new java.awt.Color(255, 255, 255));
        PanelKeterangan.setBorder(javax.swing.BorderFactory.createTitledBorder("Keterangan"));

        textAreaKet.setColumns(20);
        textAreaKet.setRows(5);
        jScrollPane2.setViewportView(textAreaKet);

        javax.swing.GroupLayout PanelKeteranganLayout = new javax.swing.GroupLayout(PanelKeterangan);
        PanelKeterangan.setLayout(PanelKeteranganLayout);
        PanelKeteranganLayout.setHorizontalGroup(
            PanelKeteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKeteranganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelKeteranganLayout.setVerticalGroup(
            PanelKeteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKeteranganLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelIdentitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(PanelRincian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(PanelKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(227, 227, 227)
                            .addComponent(LabelJudul))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(PanelIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelKeterangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelRincian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void cbGolonganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGolonganActionPerformed
        int gp = 0; //gp = gaji pokok
        int upah = 0;
        switch(cbGolongan.getSelectedIndex())
            {
                case 1 : gp = 1000000; upah = 5000; break;
                case 2 : gp = 1500000; upah = 7000; break;
                case 3 : gp = 2000000; upah = 10000; break;
                case 4 : gp = 2500000; upah = 12500; break;
            }
        txtGapok.setText(String.valueOf(gp)); 
        txtUpah.setText(String.valueOf(upah));
    }//GEN-LAST:event_cbGolonganActionPerformed

    private void txtGapokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGapokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGapokActionPerformed

    private void ButtonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHitungActionPerformed

        int jk = Integer.parseInt(txtJamKerja.getText()); //jam kerja
        int tu = Integer.parseInt(txtUpah.getText()) * jk ; //total upah
        txtTotUpah.setText(String.valueOf(tu));
        
       int totalgaji = Integer.parseInt(txtGapok.getText()) + tu ;
       txtTotGaji.setText(""+totalgaji);
        
    }//GEN-LAST:event_ButtonHitungActionPerformed

    private void ButtonDeskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeskActionPerformed
        String nama, NIK, keterangan;
        nama = txtNama.getText();
        NIK = txtNIK.getText();
        
        int tg = Integer.parseInt(txtTotGaji.getText());
        
        keterangan =    "Data Pegawai :"+
                        "\nNama         :"+nama+
                        "\n NIK         : "+NIK+
                        "\n Total Gaji  : "+tg;
        
        textAreaKet.setText(keterangan);
    }//GEN-LAST:event_ButtonDeskActionPerformed

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        int jawab = JOptionPane.showOptionDialog(this,
                    "Apakah ingin Keluar ?",
                    "Keluar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,null,null,null);
        if(jawab==JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
        txtNama.setText("");
        txtNIK.setText("");
        txtJamKerja.setText("");
        txtGapok.setText("");
        txtUpah.setText("");
        txtTotUpah.setText("");
        txtTotGaji.setText("");
        textAreaKet.setText("");
    }//GEN-LAST:event_ButtonResetActionPerformed

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
            java.util.logging.Logger.getLogger(FormatGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormatGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormatGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormatGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormatGaji().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDesk;
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonHitung;
    private javax.swing.JButton ButtonReset;
    private javax.swing.JLabel LabelGapok;
    private javax.swing.JLabel LabelGolongan;
    private javax.swing.JLabel LabelJK;
    private javax.swing.JLabel LabelJudul;
    private javax.swing.JLabel LabelNIK;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel LabelTotGaji;
    private javax.swing.JLabel LabelTotUpah;
    private javax.swing.JLabel LabelUpah;
    private javax.swing.JPanel PanelIdentitas;
    private javax.swing.JPanel PanelKeterangan;
    private javax.swing.JPanel PanelRincian;
    private javax.swing.JComboBox<String> cbGolongan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea textAreaKet;
    private javax.swing.JTextField txtGapok;
    private javax.swing.JTextField txtJamKerja;
    private javax.swing.JTextField txtNIK;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTotGaji;
    private javax.swing.JTextField txtTotUpah;
    private javax.swing.JTextField txtUpah;
    // End of variables declaration//GEN-END:variables
}
