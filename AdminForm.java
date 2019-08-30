
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
public class AdminForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
    public AdminForm() {
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
        btnadmininfo = new javax.swing.JButton();
        btnaddacc = new javax.swing.JButton();
        btnviewacc = new javax.swing.JButton();
        btnacadreport = new javax.swing.JButton();
        btnstureport = new javax.swing.JButton();
        btnfeereport = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtaccname = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaccdetail = new javax.swing.JTextArea();
        btnview = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txttypeemail = new javax.swing.JTextField();
        cmbdobday = new javax.swing.JComboBox<>();
        cmbdobmonth = new javax.swing.JComboBox<>();
        cmbdobyear = new javax.swing.JComboBox<>();
        cmbjoinday = new javax.swing.JComboBox<>();
        cmbjoinmonth = new javax.swing.JComboBox<>();
        cmbjoinyear = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("User: Admin Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnadmininfo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnadmininfo.setText("Admin Information");
        btnadmininfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadmininfoActionPerformed(evt);
            }
        });
        jPanel1.add(btnadmininfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, 183, -1));

        btnaddacc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnaddacc.setText("Add Accountant");
        jPanel1.add(btnaddacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 53, 183, -1));

        btnviewacc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnviewacc.setText("View Accountant Details");
        jPanel1.add(btnviewacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 82, -1, -1));

        btnacadreport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnacadreport.setText("Academic Reports");
        jPanel1.add(btnacadreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 111, 183, -1));

        btnstureport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnstureport.setText("Student Reports");
        btnstureport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstureportActionPerformed(evt);
            }
        });
        jPanel1.add(btnstureport, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 138, 183, -1));

        btnfeereport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnfeereport.setText("Fee Reports");
        btnfeereport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfeereportActionPerformed(evt);
            }
        });
        jPanel1.add(btnfeereport, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 167, 183, -1));

        btnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 355, 114, 34));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg7.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 200, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, -1, 403));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Add/Edit Accountant");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Employee Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DateOfBirth");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Contact No.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Joining Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Email");

        txtaccname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtaccname.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtcontact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcontact.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtemail.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("View Accountant");

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnremove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnremove.setText("Remove");

        txtaccdetail.setColumns(20);
        txtaccdetail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtaccdetail.setForeground(new java.awt.Color(0, 51, 51));
        txtaccdetail.setRows(5);
        txtaccdetail.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(txtaccdetail);

        btnview.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnview.setText("View ");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Type Emp ID");

        txttypeemail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txttypeemail.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txttypeemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeemailActionPerformed(evt);
            }
        });

        cmbdobday.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbdobday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbdobmonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbdobmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cmbdobyear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbdobyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "1019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        cmbjoinday.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbjoinday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbjoinday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbjoindayActionPerformed(evt);
            }
        });

        cmbjoinmonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbjoinmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cmbjoinyear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbjoinyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "1019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtaccname, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(cmbdobday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cmbdobmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cmbdobyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cmbjoinday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbjoinmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbjoinyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(29, 29, 29)
                                .addComponent(txttypeemail, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnview)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtaccname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbdobday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbdobmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbdobyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbjoinday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbjoinmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbjoinyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadd)
                            .addComponent(btnremove)))
                    .addComponent(jLabel7)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txttypeemail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 35, -1, -1));

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection con;
    Statement stmt;
    ResultSet rs;
    private void txttypeemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeemailActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       String accname=txtaccname.getText();
       String dob=cmbdobday.getSelectedItem()+"/"+cmbdobmonth.getSelectedItem()+"/"+cmbdobyear.getSelectedItem();
        String email=txtemail.getText();
        String contact=txtcontact.getText();
        String joiningdate=cmbjoinday.getSelectedItem()+"/"+cmbjoinmonth.getSelectedItem()+"/"+cmbjoinyear.getSelectedItem();
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/feeportal","root","password");
           if(con!=null)
             {
                stmt=(Statement)con.createStatement();
                stmt.executeUpdate("insert into addaccountant(accname,dob,email,contactno,joiningdate) values('"+accname+"','"+dob+"','"+email+"','"+contact+"','"+joiningdate+"')");
                JOptionPane.showMessageDialog(this,"Accountant added in Database Successfully" ,"Welldone!", 1);
             }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
           System.out.println("Exception Occured?");
           e.printStackTrace();
       } 
    }//GEN-LAST:event_btnaddActionPerformed

    private void cmbjoindayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbjoindayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbjoindayActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        txtaccdetail.setText("");
        String roll,accname,dob,email,contact,joiningdate,searchemail;
         searchemail=txttypeemail.getText();
        if(searchemail.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please type Email to view Accountant details ","Warning?", 1);
        }
        else
        {
        try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con=(com.mysql.jdbc.Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/feeportal","root","password");
           if(con!=null)
             {
                stmt=(com.mysql.jdbc.Statement)con.createStatement();
                rs=stmt.executeQuery("select * from addaccountant where email='"+searchemail+"'");
                while(rs.next())
                {
                        accname="Accname-   "+rs.getString("accname");
                        dob="Dob-    "+rs.getString("dob");
                        email="Email-    "+rs.getString("email");
                        contact="Contactno-    "+rs.getString("contactno");
                        joiningdate="JoiningDate   "+rs.getString("joiningdate");
                        txtaccdetail.append(accname +"\n");
                        txtaccdetail.append(dob+"\n");
                        txtaccdetail.append(email+"\n");
                        txtaccdetail.append(contact+"\n");
                        txtaccdetail.append(joiningdate+"\n");
                }
             }
       }
       catch(Exception e)
       {
           System.out.println("Exception Occured?");
           e.printStackTrace();
       }
      }
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        AdminLogin al=new AdminLogin();
        al.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnstureportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstureportActionPerformed
       StudentReports sr=new StudentReports();
        sr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnstureportActionPerformed

    private void btnfeereportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfeereportActionPerformed
        FeeReports fr=new FeeReports();
        fr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnfeereportActionPerformed

    private void btnadmininfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadmininfoActionPerformed
        AdminInfo ai=new AdminInfo();
        ai.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnadmininfoActionPerformed

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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacadreport;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnaddacc;
    private javax.swing.JButton btnadmininfo;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnfeereport;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnstureport;
    private javax.swing.JButton btnview;
    private javax.swing.JButton btnviewacc;
    private javax.swing.JComboBox<String> cmbdobday;
    private javax.swing.JComboBox<String> cmbdobmonth;
    private javax.swing.JComboBox<String> cmbdobyear;
    private javax.swing.JComboBox<String> cmbjoinday;
    private javax.swing.JComboBox<String> cmbjoinmonth;
    private javax.swing.JComboBox<String> cmbjoinyear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtaccdetail;
    private javax.swing.JTextField txtaccname;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txttypeemail;
    // End of variables declaration//GEN-END:variables
}