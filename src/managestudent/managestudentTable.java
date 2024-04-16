/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managestudent;

import manageBook.*;
import admin.dashBoard;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.TableModel;
import managestudent.managestudentForm;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author scc-college
 */
public class managestudentTable extends javax.swing.JFrame {

    /**
     * Creates new form managebookTable
     */
    public managestudentTable() {
        initComponents();
        displayData();
        
    }
    
    
        public String action, gender;

    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
           ResultSet rs = dbc.getData("SELECT * FROM tbl_students ");
           student_table.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
       
        }       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        b_refresh1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        book_search = new javax.swing.JTextField();
        b_delete = new javax.swing.JButton();
        b_update = new javax.swing.JButton();
        b_add = new javax.swing.JButton();
        b_label = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(102, 102, 225));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 80, -1));

        jPanel7.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 360, 5));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONaddnewbook/icons8_Books_52px_1.png"))); // NOI18N
        jLabel5.setText("student table");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 300, -1));

        student_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(student_table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 560, 440));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONaddnewbook/icons8_Rewind_48px.png"))); // NOI18N
        jLabel1.setText("Back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 50));

        b_refresh1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_refresh1.setText("REFRESH");
        b_refresh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_refresh1MouseClicked(evt);
            }
        });
        b_refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refresh1ActionPerformed(evt);
            }
        });
        jPanel1.add(b_refresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 90, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 670, 90, 40));

        book_search.setBackground(new java.awt.Color(102, 102, 225));
        book_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        book_search.setForeground(new java.awt.Color(255, 255, 255));
        book_search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        book_search.setText("\n");
        book_search.setToolTipText("");
        book_search.setAutoscrolls(false);
        book_search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(book_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, 170, -1));

        b_delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_delete.setText("DELETE");
        b_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_deleteMouseClicked(evt);
            }
        });
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(b_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 90, 40));

        b_update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_update.setText("EDIT");
        b_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_updateActionPerformed(evt);
            }
        });
        jPanel1.add(b_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 90, 40));

        b_add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_add.setText("ADD");
        b_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_addActionPerformed(evt);
            }
        });
        jPanel1.add(b_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 90, 40));

        b_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_label.setText("LABEL");
        b_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_labelMouseClicked(evt);
            }
        });
        b_label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_labelActionPerformed(evt);
            }
        });
        jPanel1.add(b_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        managebookForm managebookForm = new managebookForm();
        managebookForm.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dashBoard dashBoard = new dashBoard();
        dashBoard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void b_refresh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_refresh1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b_refresh1MouseClicked

    private void b_refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refresh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_refresh1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
        // TODO add your handling code here:
        int rowIndex = student_table.getSelectedRow();
        if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Please select data first from the table");
            
        }else{
            TableModel model = student_table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();          
            int a = JOptionPane.showConfirmDialog(null,"are you sure to delete ID: "+id);
            if(a == JOptionPane.YES_OPTION){
                dbConnector dbc = new dbConnector();
                int s_id = Integer.parseInt(id);
                dbc.deleteData(s_id,"tbl_students","s_id");
                displayData();
            }
           
        }
    }//GEN-LAST:event_b_deleteActionPerformed

    private void b_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_updateActionPerformed
        // TODO add your handling code here:
       int rowindex = student_table.getSelectedRow();
      if(rowindex < 0){
           JOptionPane.showMessageDialog(null, "Please Select an Item");

          
      }else{
          TableModel model = student_table.getModel();
          managestudentForm msf = new managestudentForm();
          msf.st_id.setText(""+model.getValueAt(rowindex, 0));
          msf.st_fn.setText(""+model.getValueAt(rowindex, 1));
          msf.st_ad.setText(""+model.getValueAt(rowindex, 2));
          msf.st_ln.setText(""+model.getValueAt(rowindex, 3));
          msf.gender = model.getValueAt(rowindex, 4).toString();   
          String gend = model.getValueAt(rowindex, 4).toString(); 
          if(gend.equals("Male")){
            msf.male.setSelected(true);
          }
          if(gend.equals("Female")){
            msf.female.setSelected(true);
          }                      
          msf.st_ct.setText(model.getValueAt(rowindex, 5).toString());
          msf.st_em.setText(model.getValueAt(rowindex, 6).toString());
          msf.setVisible(true);
          msf.action = "Update";
          msf.st_lb.setText("UPDATE");
          
         
         
      }

    }//GEN-LAST:event_b_updateActionPerformed

    private void b_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_addActionPerformed
        // TODO add your handling code here:
        managestudentForm msf = new managestudentForm();
        msf.setVisible(true);
        msf.action = "Add";
        msf.st_lb.setText("SAVE");
        this.dispose();
        
    }//GEN-LAST:event_b_addActionPerformed

    private void b_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_labelMouseClicked
        // TODO add your handling code here:
        displayData();
    }//GEN-LAST:event_b_labelMouseClicked

    private void b_labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_labelActionPerformed
        // TODO add your handling code here:
     
        
    }//GEN-LAST:event_b_labelActionPerformed

    private void b_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_deleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b_deleteMouseClicked

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
            java.util.logging.Logger.getLogger(managestudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managestudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managestudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managestudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managestudentTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_add;
    private javax.swing.JButton b_delete;
    public javax.swing.JButton b_label;
    private javax.swing.JButton b_refresh1;
    private javax.swing.JButton b_update;
    private javax.swing.JTextField book_search;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable student_table;
    // End of variables declaration//GEN-END:variables
}
