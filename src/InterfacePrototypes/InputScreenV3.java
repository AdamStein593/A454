/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacePrototypes;

/**
 *
 * @author Adam
 */
public class InputScreenV3 extends javax.swing.JFrame {

    /**
     * Creates new form InputScreenV2
     */
    public InputScreenV3() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(490, 0, 80, 30);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adam\\Pictures\\diagram3.png")); // NOI18N
        jLabel15.setBounds(30, 70, 190, 130);
        jLayeredPane1.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Inclined Planes");
        jLabel16.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel16.setBounds(0, 0, 570, 60);
        jLayeredPane1.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel17.setText("Acceleration");
        jLabel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel17.setBounds(390, 230, 90, 30);
        jLayeredPane1.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField9.setBounds(480, 230, 80, 30);
        jLayeredPane1.add(jTextField9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel18.setText("Slipping Direction");
        jLabel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel18.setBounds(250, 120, 120, 30);
        jLayeredPane1.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField10.setBackground(new java.awt.Color(153, 153, 153));
        jTextField10.setBounds(100, 230, 80, 30);
        jLayeredPane1.add(jTextField10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel19.setText("Force");
        jLabel19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel19.setBounds(200, 230, 90, 30);
        jLayeredPane1.add(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField11.setBounds(290, 230, 80, 30);
        jLayeredPane1.add(jTextField11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField12.setBounds(100, 310, 80, 30);
        jLayeredPane1.add(jTextField12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel20.setText("Reaction");
        jLabel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel20.setBounds(10, 310, 90, 30);
        jLayeredPane1.add(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel21.setText("θ");
        jLabel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel21.setBounds(200, 270, 90, 30);
        jLayeredPane1.add(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField13.setBounds(290, 270, 80, 30);
        jLayeredPane1.add(jTextField13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel22.setText("Friction Force");
        jLabel22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel22.setBounds(390, 270, 90, 30);
        jLayeredPane1.add(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField14.setBounds(480, 270, 80, 30);
        jLayeredPane1.add(jTextField14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField22.setBounds(100, 270, 80, 30);
        jLayeredPane1.add(jTextField22, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel32.setText("µ");
        jLabel32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel32.setBounds(10, 270, 90, 30);
        jLayeredPane1.add(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel33.setText("Weight");
        jLabel33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel33.setBounds(200, 310, 90, 30);
        jLayeredPane1.add(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField23.setBounds(290, 310, 80, 30);
        jLayeredPane1.add(jTextField23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("Submit");
        jButton3.setBounds(390, 310, 170, 100);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setText("Clear");
        jButton4.setBounds(10, 350, 170, 60);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel34.setText("Mass");
        jLabel34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel34.setBounds(10, 230, 90, 30);
        jLayeredPane1.add(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mass", "Force", "Acceleration", "µ", "θ", "Friction Force", "Reaction", "Weight" }));
        jComboBox2.setBounds(370, 70, 120, 30);
        jLayeredPane1.add(jComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel35.setText("Value To Calculate");
        jLabel35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel35.setBounds(250, 70, 120, 30);
        jLayeredPane1.add(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Down");
        jRadioButton3.setBounds(420, 120, 70, 23);
        jLayeredPane1.add(jRadioButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Up");
        jRadioButton4.setBounds(380, 120, 40, 23);
        jLayeredPane1.add(jRadioButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(InputScreenV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputScreenV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputScreenV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputScreenV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputScreenV3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}