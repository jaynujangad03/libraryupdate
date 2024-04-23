/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user;


import admin.*;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import librarymanagementsystem.loginForm;
import manageBook.managebookForm;
import manageBook.managebookTable;
import managestudent.managestudentTable;
import static register.registerForm.email;

/**
 *
 * @author scc-college
 */
public class changePass extends javax.swing.JFrame {

    /** Creates new form dashBoard */
    public changePass() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        iddisplay = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        acc_fn = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        acc_user = new javax.swing.JLabel();
        acc_ln = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        oldpass = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        newpass = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        conpass = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        acc_ln1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONadmin/icons8_menu_48px_1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 60));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        iddisplay.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        iddisplay.setForeground(new java.awt.Color(255, 255, 255));
        iddisplay.setText("(UID)");
        jPanel1.add(iddisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Change Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 60));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        acc_fn.setForeground(new java.awt.Color(255, 255, 255));
        acc_fn.setText("ACC_FN");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(acc_fn)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(acc_fn)
                .addContainerGap())
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 340, 40));

        jPanel6.setBackground(new java.awt.Color(255, 51, 51));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONadmin/icons8_Home_26px_2.png"))); // NOI18N
        jLabel16.setText("Home Page");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel16)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 340, 60));

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, -1));

        acc_user.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        acc_user.setForeground(new java.awt.Color(255, 255, 255));
        acc_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONadmin/male_user_50px.png"))); // NOI18N
        jPanel3.add(acc_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 50));

        acc_ln.setForeground(new java.awt.Color(255, 255, 255));
        acc_ln.setText("USER");
        jPanel3.add(acc_ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 250, 320));

        jPanel7.setBackground(new java.awt.Color(102, 102, 225));
        jPanel7.setForeground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Type the old password:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        oldpass.setBackground(new java.awt.Color(102, 102, 225));
        oldpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        oldpass.setForeground(new java.awt.Color(255, 255, 255));
        oldpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        oldpass.setToolTipText("");
        oldpass.setAutoscrolls(false);
        oldpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 170, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Enter the new password:");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        newpass.setBackground(new java.awt.Color(102, 102, 225));
        newpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newpass.setForeground(new java.awt.Color(255, 255, 255));
        newpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newpass.setToolTipText("");
        newpass.setAutoscrolls(false);
        newpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 170, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Confirm password:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        conpass.setBackground(new java.awt.Color(102, 102, 225));
        conpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        conpass.setForeground(new java.awt.Color(255, 255, 255));
        conpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        conpass.setToolTipText("");
        conpass.setAutoscrolls(false);
        conpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        conpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpassActionPerformed(evt);
            }
        });
        jPanel7.add(conpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 170, -1));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(null);

        acc_ln1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        acc_ln1.setForeground(new java.awt.Color(255, 0, 0));
        acc_ln1.setText("SAVE");
        jPanel4.add(acc_ln1);
        acc_ln1.setBounds(30, 10, 50, 14);

        jPanel7.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 100, 40));

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("BACK");
        jPanel8.add(jLabel2);
        jLabel2.setBounds(20, 10, 60, 20);

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 100, 40));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 390, 320));

        setSize(new java.awt.Dimension(655, 419));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
        
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "This settings was not finish done ye");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Session sess = Session.getInstance();
        iddisplay.setText("USER ID:"+sess.getUid());
        
      
       
    }//GEN-LAST:event_formWindowActivated

    private void conpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpassActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        try{
        dbConnector dbc = new dbConnector();
        Session sess = Session.getInstance();
          
            String query = "SELECT * FROM tbl_user WHERE u_id = '" + sess.getUid() + "'";
            ResultSet rs = dbc.getData(query);
        if(rs.next()){
           String olddbpass = rs.getString("u_password");
           String oldhash = passwordHasher.hashPassword(oldpass.getText());
            
            if(olddbpass.equals(oldhash)){
                String npass = passwordHasher.hashPassword(newpass.getText());
                dbc.updateData("UPDATE tbl_user SET u_password = ''"+npass+"");
                JOptionPane.showMessageDialog(null,"Successfully Updated");
                loginForm loginForm = new loginForm();
                loginForm.setVisible(true);
                this.dispose();
                
            }else{
                JOptionPane.showMessageDialog(null,"Old password is incorrect");
            }
            
        }    
        }catch(SQLException | NoSuchAlgorithmException ex){
            System.out.println(""+ex);
        }
    }//GEN-LAST:event_jPanel4MouseClicked

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
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_fn;
    private javax.swing.JLabel acc_ln;
    private javax.swing.JLabel acc_ln1;
    private javax.swing.JLabel acc_user;
    private javax.swing.JTextField conpass;
    private javax.swing.JLabel iddisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField newpass;
    private javax.swing.JTextField oldpass;
    // End of variables declaration//GEN-END:variables

}