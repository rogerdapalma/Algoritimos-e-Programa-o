package Calculadora;

import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_soma = new javax.swing.JButton();
        jButton_sub = new javax.swing.JButton();
        jButton_mult = new javax.swing.JButton();
        jButton_div = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_salvaNUM1 = new javax.swing.JTextField();
        jTextField_salvaNUM2 = new javax.swing.JTextField();
        jTextField_Resultado = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("numero 1:");

        jLabel4.setText("numero 2:");

        jButton_soma.setText(" + ");
        jButton_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_somaActionPerformed(evt);
            }
        });

        jButton_sub.setText(" -  ");
        jButton_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_subActionPerformed(evt);
            }
        });

        jButton_mult.setText(" * ");
        jButton_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_multActionPerformed(evt);
            }
        });

        jButton_div.setText(" / ");
        jButton_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_divActionPerformed(evt);
            }
        });

        jLabel5.setText("Resultado:");

        jTextField_salvaNUM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_salvaNUM1ActionPerformed(evt);
            }
        });

        jTextField_salvaNUM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_salvaNUM2ActionPerformed(evt);
            }
        });

        jTextField_Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ResultadoActionPerformed(evt);
            }
        });

        jButton5.setText("INFO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("limpar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_salvaNUM2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_salvaNUM1))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_soma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_sub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_mult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_div))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_salvaNUM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_salvaNUM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_soma)
                    .addComponent(jButton_sub)
                    .addComponent(jButton_mult)
                    .addComponent(jButton_div))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_salvaNUM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_salvaNUM1ActionPerformed

    }//GEN-LAST:event_jTextField_salvaNUM1ActionPerformed

    private void jTextField_salvaNUM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_salvaNUM2ActionPerformed

    }//GEN-LAST:event_jTextField_salvaNUM2ActionPerformed

    private void jButton_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_somaActionPerformed
        Calculadora calculadora = new Calculadora();
        double num1 = Double.parseDouble(jTextField_salvaNUM1.getText());
        double num2 = Double.parseDouble(jTextField_salvaNUM2.getText());

        double resultado = calculadora.soma(num1, num2);

        jTextField_Resultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_jButton_somaActionPerformed

    private void jButton_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_subActionPerformed
        Calculadora calculadora = new Calculadora();
        double num1 = Double.parseDouble(jTextField_salvaNUM1.getText());
        double num2 = Double.parseDouble(jTextField_salvaNUM2.getText());

        double resultado = calculadora.sub(num1, num2);

        jTextField_Resultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_jButton_subActionPerformed

    private void jButton_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_multActionPerformed
        Calculadora calculadora = new Calculadora();
        double num1 = Double.parseDouble(jTextField_salvaNUM1.getText());
        double num2 = Double.parseDouble(jTextField_salvaNUM2.getText());

        double resultado = calculadora.mult(num1, num2);

        jTextField_Resultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_jButton_multActionPerformed

    private void jButton_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_divActionPerformed
        Calculadora calculadora = new Calculadora();
        double num1 = Double.parseDouble(jTextField_salvaNUM1.getText());
        double num2 = Double.parseDouble(jTextField_salvaNUM2.getText());

        double resultado = calculadora.div(num1, num2);

        jTextField_Resultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_jButton_divActionPerformed

    private void jTextField_ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ResultadoActionPerformed

    }//GEN-LAST:event_jTextField_ResultadoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(this, "digite o primeiro numero, apos o segundo e clique na operacao que deseja!");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextField_Resultado.setText("");
        jTextField_salvaNUM1.setText("");
        jTextField_salvaNUM2.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton_div;
    private javax.swing.JButton jButton_mult;
    private javax.swing.JButton jButton_soma;
    private javax.swing.JButton jButton_sub;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField_Resultado;
    private javax.swing.JTextField jTextField_salvaNUM1;
    private javax.swing.JTextField jTextField_salvaNUM2;
    // End of variables declaration//GEN-END:variables
}
