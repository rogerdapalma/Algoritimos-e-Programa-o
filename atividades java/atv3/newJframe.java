package ava3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class newJframe extends javax.swing.JFrame {

    Arquivo arquivo = new Arquivo();

    public newJframe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_ler = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_dados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_ler.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_ler.setText("salvar");
        jButton_ler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lerActionPerformed(evt);
            }
        });

        jTable_dados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "nome", "email"
            }
        ));
        jScrollPane1.setViewportView(jTable_dados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_ler, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_ler, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_lerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lerActionPerformed
        
            ArrayList nomes = null;
        try {
            nomes = arquivo.ler("info",0);
        } catch (IOException ex) {
            Logger.getLogger(newJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
            jTable_dados.setValueAt(nomes.get(0), 0, 0);
            jTable_dados.setValueAt(nomes.get(1), 1, 0);
            jTable_dados.setValueAt(nomes.get(2), 2, 0);
            
            ArrayList emails = null;
        try {
            emails = arquivo.ler("info",1);
        } catch (IOException ex) {
            Logger.getLogger(newJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
            jTable_dados.setValueAt(emails.get(0), 0, 1);
            jTable_dados.setValueAt(emails.get(1), 1, 1);
            jTable_dados.setValueAt(emails.get(2), 2, 1);
       
            
       
    }//GEN-LAST:event_jButton_lerActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ler;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_dados;
    // End of variables declaration//GEN-END:variables
}