/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class grocerries extends javax.swing.JFrame {

    /**
     * Creates new form grocerries
     */
    public grocerries() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        sapricee = new javax.swing.JLabel();
        rprice = new javax.swing.JLabel();
        oprice = new javax.swing.JLabel();
        bprice = new javax.swing.JLabel();
        sprice = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        rbuy = new javax.swing.JButton();
        sbuy = new javax.swing.JButton();
        sabuy = new javax.swing.JButton();
        bbuy = new javax.swing.JButton();
        obuy = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        squantity = new javax.swing.JTextField();
        oquantity = new javax.swing.JTextField();
        saquantity = new javax.swing.JTextField();
        bquantity = new javax.swing.JTextField();
        rquantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Price");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Grocerries");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Item");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Sugar");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Oil");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Salt");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Rice");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Bread");

        sapricee.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        sapricee.setForeground(new java.awt.Color(255, 255, 255));
        sapricee.setText("30/kg");

        rprice.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        rprice.setForeground(new java.awt.Color(255, 255, 255));
        rprice.setText("45/kg");

        oprice.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        oprice.setForeground(new java.awt.Color(255, 255, 255));
        oprice.setText("85/ltr");

        bprice.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bprice.setForeground(new java.awt.Color(255, 255, 255));
        bprice.setText("10/p");

        sprice.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        sprice.setForeground(new java.awt.Color(255, 255, 255));
        sprice.setText("55/kg");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Quantity");

        rbuy.setText("BUY");
        rbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sbuy.setText("BUY");
        sbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        sabuy.setText("BUY");
        sabuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        bbuy.setText("BUY");
        bbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        obuy.setText("BUY");
        obuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton21.setText("Baxk");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        squantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squantityActionPerformed(evt);
            }
        });

        saquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saquantityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel50)
                    .addComponent(jLabel49)
                    .addComponent(jLabel48)
                    .addComponent(jLabel47)
                    .addComponent(jLabel46))
                .addGap(189, 189, 189)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bprice, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sapricee, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rprice, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(140, 140, 140)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(saquantity, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                        .addComponent(bquantity))
                                    .addComponent(rquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sprice)
                                    .addComponent(oprice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(oquantity, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(squantity))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbuy)
                            .addComponent(sbuy)
                            .addComponent(obuy)
                            .addComponent(sabuy)
                            .addComponent(bbuy))
                        .addGap(141, 141, 141))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addGap(133, 133, 133)
                                .addComponent(jLabel56)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel45)
                    .addComponent(jLabel56))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rprice)
                    .addComponent(jLabel49)
                    .addComponent(rbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(rquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(sprice)
                            .addComponent(sbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oprice)
                            .addComponent(jLabel47)
                            .addComponent(obuy, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(oquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(sapricee)
                    .addComponent(sabuy, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(saquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bprice)
                    .addComponent(jLabel50)
                    .addComponent(bbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(bquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1008, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Payment py = new Payment();
       py.setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Payment py = new Payment();
       py.setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      Payment py = new Payment();
       py.setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Payment py = new Payment();
       py.setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        String rp = rprice.getText();
        String rq = rquantity.getText();
        if( rp.isEmpty() || rq.isEmpty()){
             JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);
        }else{

             Connection dbcon = DBconnect.connectDB();

            try {
                PreparedStatement st = (PreparedStatement)
                dbcon.prepareStatement("INSERT INTO rice (rprice,rquantity) VALUES(?,?)");



            st.setString(1, rp);
            st.setString(2, rq);
          





            int rs = st.executeUpdate();



            JOptionPane.showMessageDialog(this, "Buy Successful.", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);

               dispose();
               Payment hm = new Payment();
               hm.setVisible(true);

            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);

            rprice.setText("");
            rprice.requestFocus();
            rquantity.setText("");

        }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        home hm = new home();        
hm.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void squantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_squantityActionPerformed

    private void saquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saquantityActionPerformed

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
            java.util.logging.Logger.getLogger(grocerries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grocerries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grocerries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grocerries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grocerries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbuy;
    private javax.swing.JLabel bprice;
    private javax.swing.JTextField bquantity;
    private javax.swing.JButton jButton21;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton obuy;
    private javax.swing.JLabel oprice;
    private javax.swing.JTextField oquantity;
    private javax.swing.JButton rbuy;
    private javax.swing.JLabel rprice;
    private javax.swing.JTextField rquantity;
    private javax.swing.JButton sabuy;
    private javax.swing.JLabel sapricee;
    private javax.swing.JTextField saquantity;
    private javax.swing.JButton sbuy;
    private javax.swing.JLabel sprice;
    private javax.swing.JTextField squantity;
    // End of variables declaration//GEN-END:variables
}
