
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prem
 */
public class SecurityRefundDetails extends javax.swing.JFrame {

    /**
     * Creates new form SecurityRefundDetails
     */
    public SecurityRefundDetails() {
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

        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtbillno = new javax.swing.JTextField();
        txtbillamount = new javax.swing.JTextField();
        txtrecname = new javax.swing.JTextField();
        cmbrecby = new javax.swing.JComboBox<>();
        txtidno = new javax.swing.JTextField();
        cmbrecid = new javax.swing.JComboBox<>();
        cmbrefundday = new javax.swing.JComboBox<>();
        txtsecpaid = new javax.swing.JTextField();
        cmbrefundmonth = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cmbrefundmode = new javax.swing.JComboBox<>();
        btnsubmit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbrefundyear = new javax.swing.JComboBox<>();
        cmbdegree = new javax.swing.JComboBox<>();
        btnclose = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 102, 102));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Security Refund Payment Details");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, -5, 430, 40));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Bill No.");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 140, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Bill Amount");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Bill Date");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 61, 100, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Degree Issued");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 90, -1, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Security Paid");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 119, 140, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Security Received By");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 148, -1, -1));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Receiver Name");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 174, 140, -1));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Receiver Id");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, 140, -1));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Id No.");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 100, 30));

        txtbillno.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtbillno, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 61, 136, -1));

        txtbillamount.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtbillamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 90, 136, -1));

        txtrecname.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtrecname, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 174, 138, -1));

        cmbrecby.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbrecby.setForeground(new java.awt.Color(0, 102, 102));
        cmbrecby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Self", "Guargian" }));
        getContentPane().add(cmbrecby, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 145, 136, -1));

        txtidno.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtidno, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 200, 200, 30));

        cmbrecid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbrecid.setForeground(new java.awt.Color(0, 102, 102));
        cmbrecid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adhar", "Pan Card", "Voter Id" }));
        getContentPane().add(cmbrecid, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 202, 137, -1));

        cmbrefundday.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbrefundday.setForeground(new java.awt.Color(0, 102, 102));
        cmbrefundday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(cmbrefundday, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        txtsecpaid.setForeground(new java.awt.Color(0, 102, 102));
        txtsecpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsecpaidActionPerformed(evt);
            }
        });
        getContentPane().add(txtsecpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 119, 136, -1));

        cmbrefundmonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbrefundmonth.setForeground(new java.awt.Color(0, 102, 102));
        cmbrefundmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(cmbrefundmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Mode");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 119, 100, -1));

        cmbrefundmode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbrefundmode.setForeground(new java.awt.Color(0, 102, 102));
        cmbrefundmode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ECS by PAO", "Online TRF from NGF", "Cheque from NGF", "Cheque from PAO" }));
        getContentPane().add(cmbrefundmode, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 116, 200, -1));

        btnsubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(0, 102, 102));
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 268, 108, 38));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Reset");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 268, 102, 38));

        cmbrefundyear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbrefundyear.setForeground(new java.awt.Color(0, 102, 102));
        cmbrefundyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "1019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        getContentPane().add(cmbrefundyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        cmbdegree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbdegree.setForeground(new java.awt.Color(0, 102, 102));
        cmbdegree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        getContentPane().add(cmbdegree, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 87, 65, -1));

        btnclose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnclose.setForeground(new java.awt.Color(0, 102, 102));
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 267, 95, 36));

        btnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnback.setForeground(new java.awt.Color(0, 102, 102));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 267, 78, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginbg1.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 660, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsecpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsecpaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsecpaidActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        String billno=txtbillno.getText();
        String billdate=cmbrefundday.getSelectedItem()+"/"+cmbrefundmonth.getSelectedItem()+"/"+cmbrefundyear.getSelectedItem();
        String billamount=txtbillamount.getText();
        String securitypaid=txtsecpaid.getText();
        String degissued=(String) cmbdegree.getSelectedItem();
        String refmode=(String) cmbrefundmode.getSelectedItem();
        String secrecby=(String) cmbrecby.getSelectedItem();
        String recname=txtrecname.getText();
        String recid=(String) cmbrecid.getSelectedItem();
        String idno=txtidno.getText();
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
          Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/feeportal","root","password");
           if(con!=null)
             {
               Statement stmt = (Statement)con.createStatement();
                stmt.executeUpdate("insert into securityrefund(billno,billdate,billamount,securitypaid,degissued,refmode,secrecby,recname,recid,idno) values('"+billno+"','"+billdate+"','"+billamount+"','"+securitypaid+"','"+degissued+"','"+refmode+"','"+secrecby+"','"+recname+"','"+recid+"','"+idno+"')");
                JOptionPane.showMessageDialog(this,"Security Refund Details added in Database Successfully","Weldone!", 1);
             }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e.getMessage() ,"Exception Occured?", 1);
           System.out.println("Exception Occured?");
           e.printStackTrace();
       }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        AccForm acf=new AccForm();
        acf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btncloseActionPerformed

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
            java.util.logging.Logger.getLogger(SecurityRefundDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecurityRefundDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecurityRefundDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecurityRefundDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecurityRefundDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> cmbdegree;
    private javax.swing.JComboBox<String> cmbrecby;
    private javax.swing.JComboBox<String> cmbrecid;
    private javax.swing.JComboBox<String> cmbrefundday;
    private javax.swing.JComboBox<String> cmbrefundmode;
    private javax.swing.JComboBox<String> cmbrefundmonth;
    private javax.swing.JComboBox<String> cmbrefundyear;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtbillamount;
    private javax.swing.JTextField txtbillno;
    private javax.swing.JTextField txtidno;
    private javax.swing.JTextField txtrecname;
    private javax.swing.JTextField txtsecpaid;
    // End of variables declaration//GEN-END:variables
}
