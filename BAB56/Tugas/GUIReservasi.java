/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BAB56.Tugas;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Auliya Putra
 */
public class GUIReservasi extends javax.swing.JFrame {

    /**
     * Creates new form GUIReservasi
     */
    public GUIReservasi() {
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

        jLabel1 = new javax.swing.JLabel();
        comboJenis = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLagu = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTampilkan = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pilih Jenis Event :");

        comboJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Konser", "Event Hiburan" }));
        comboJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJenisActionPerformed(evt);
            }
        });

        tableLagu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Event", "Pemesan", "Jumlah", "Kategori"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableLagu);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnTampilkan.setText("Tampilkan");
        btnTampilkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilkanActionPerformed(evt);
            }
        });

        btnClose.setText("Tutup");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClose))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBatal)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addGap(18, 18, 18)
                                .addComponent(btnTampilkan, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnBatal)
                    .addComponent(btnHapus)
                    .addComponent(btnTampilkan)
                    .addComponent(btnClose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTampilkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilkanActionPerformed
         DefaultTableModel model = (DefaultTableModel) tableLagu.getModel();
model.setRowCount(0);

String jenis = comboJenis.getSelectedItem().toString();
Reservasi[] data;
if ("Konser".equals(jenis)) {
    data = new Reservasi[]{
        new Konser("Konser Sheila On 7", "Aulijah"),
        new Konser("Konser Dewa 19", "Alyssa")
    };
} else {
    data = new Reservasi[]{
        new EventHiburan("Drama Musikal", "Alkalifi"),
        new EventHiburan("Stand-up Comedy", "Aulija")
    };
}
for (Reservasi r : data) {
    r.setData(r.namaEvent, r.namaPemesan, 2);
    model.addRow(new Object[]{
        r.namaEvent, r.namaPemesan, r.jumlahTiket, r.kategoriEvent()
    });
}

    }//GEN-LAST:event_btnTampilkanActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
 JOptionPane.showMessageDialog(this, "Data disimpan (simulasi).");

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void comboJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboJenisActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
         comboJenis.setSelectedIndex(0);  // Reset combo box
    DefaultTableModel model = (DefaultTableModel) tableLagu.getModel();
    model.setRowCount(0);  // Kosongkan tabel
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
       int row = tableLagu.getSelectedRow();
    if (row >= 0) {
        ((DefaultTableModel) tableLagu.getModel()).removeRow(row);
    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus.");
    }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
       dispose();  // Menutup jendela
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(GUIReservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIReservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIReservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIReservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIReservasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTampilkan;
    private javax.swing.JComboBox<String> comboJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLagu;
    // End of variables declaration//GEN-END:variables

}
