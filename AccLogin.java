
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
public class AccLogin extends javax.swing.JFrame {

    /**
     * Creates new form AccLogin
     */
    public AccLogin() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        btnacclogin = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btnsingup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Accountant Login");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Name ");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 36, 110, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Password");
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 110, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Email");
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 105, 110, -1));

        txtname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtname.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 33, 201, -1));

        txtemail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtemail.setForeground(new java.awt.Color(0, 102, 102));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 102, 201, -1));

        btnacclogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnacclogin.setForeground(new java.awt.Color(0, 102, 102));
        btnacclogin.setText("Login");
        btnacclogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnacclogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 169, 276, 45));

        btncancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncancel.setForeground(new java.awt.Color(0, 102, 102));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 257, -1, -1));

        btnback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(0, 102, 102));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 257, 99, -1));

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 67, 201, 29));

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginbg1.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -59, 530, 370));

        btnsingup.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsingup.setForeground(new java.awt.Color(0, 102, 102));
        btnsingup.setText("SignUp");
        btnsingup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsingupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsingup, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1))
                    .addComponent(btnsingup, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtemailActionPerformed

    private void btnaccloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccloginActionPerformed
        AccForm accf=new AccForm();
        String nm=txtname.getText();
        char[] passchar=txtpass.getPassword();
        String pass=new String(passchar);
        String email=txtemail.getText();
        if(nm.equals("")||pass.equals("")||email.equals(""))
        {       
                JOptionPane.showMessageDialog(null,"Please Fill all  fields first ","Warning?", 1);
        }
        else
        {
               String regex = "^([_a-zA-Z0-9-]+(.[_a-zA-Z0-9-]+)*@gmail.com)?$";
                Pattern pattern = Pattern.compile(regex);
                String nmreg = "^([_a-zA-Z])+$";
                Pattern pattern1 = Pattern.compile(nmreg);
                Matcher matcher = pattern.matcher(email);
                Matcher matcher1 = pattern1.matcher(nm);
                  if (!matcher1.matches()) 
                    {
                        JOptionPane.showMessageDialog(null,"Your name is not valid ","Warning?", 1);
                    }
                    else
                    {
                        if (!matcher.matches()) 
                        {
                        JOptionPane.showMessageDialog(null,"Your Email is not valid ","Warning?", 1);
                        }
                        else
                        {
                            if(nm.equals("prem") && pass.equals("1234"))
                            {
            
                                accf.setVisible(true);
                                this.setVisible(false);
                            }
                            else
                                JOptionPane.showMessageDialog(null,"Your username and password are not valid","Warning?", 1);
                        }
                    }
        }
    }//GEN-LAST:event_btnaccloginActionPerformed

    private void btnsingupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsingupActionPerformed
         SignUp sup=new SignUp();
        sup.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnsingupActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        SfpForm sfp=new SfpForm();
        sfp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbackActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

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
            java.util.logging.Logger.getLogger(AccLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacclogin;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsingup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
