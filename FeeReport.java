
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prem
 */
public class FeeReport extends javax.swing.JFrame {

    /**
     * Creates new form FeeReport
     */
    public FeeReport() {
        initComponents();
        showUser();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtrollno = new javax.swing.JTextField();
        txtsname = new javax.swing.JTextField();
        txtcourse = new javax.swing.JTextField();
        txtbranch = new javax.swing.JTextField();
        txtyear = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        txtfeeamount = new javax.swing.JTextField();
        cmbpayday = new javax.swing.JComboBox<>();
        cmbpaymonth = new javax.swing.JComboBox<>();
        cmbpayyear = new javax.swing.JComboBox<>();
        cmbfeestatus = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        rbtncash = new javax.swing.JRadioButton();
        rbtndd = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        rbtnonline = new javax.swing.JRadioButton();
        txtrefno = new javax.swing.JTextField();
        txtddno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtcat = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        stufeetable = new javax.swing.JTable();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginbg1.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Detail of Part Payment of Academic Fee");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Student Name");
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Course");
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Branch");
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Year");
        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 110, 20));

        txtrollno.setText("004");
        jPanel1.add(txtrollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 18, 130, 30));
        jPanel1.add(txtsname, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 60, 130, 30));
        jPanel1.add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 130, 30));
        jPanel1.add(txtbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 130, 30));
        jPanel1.add(txtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 130, 30));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Fee Amount");
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 11, 120, -1));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Fee Status");
        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 120, -1));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("Payment Receiving Date(dd/mm/yyyy)");
        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        btnsubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 132, -1));
        jPanel1.add(txtfeeamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 11, 130, -1));

        cmbpayday.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbpayday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cmbpayday, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        cmbpaymonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbpaymonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(cmbpaymonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        cmbpayyear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbpayyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "1019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel1.add(cmbpayyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        cmbfeestatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbfeestatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paid", "Unpaid" }));
        jPanel1.add(cmbfeestatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 50, 130, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Mode of Payment");
        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, 20));

        buttonGroup1.add(rbtncash);
        rbtncash.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtncash.setForeground(new java.awt.Color(51, 0, 204));
        rbtncash.setText("Cash");
        jPanel1.add(rbtncash, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 70, -1));

        buttonGroup1.add(rbtndd);
        rbtndd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtndd.setForeground(new java.awt.Color(51, 0, 204));
        rbtndd.setText("DD");
        jPanel1.add(rbtndd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 70, -1));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("DD NO.");
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 90, -1));

        buttonGroup1.add(rbtnonline);
        rbtnonline.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnonline.setForeground(new java.awt.Color(51, 0, 204));
        rbtnonline.setSelected(true);
        rbtnonline.setText("Online");
        rbtnonline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnonlineActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnonline, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));
        jPanel1.add(txtrefno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 134, 30));
        jPanel1.add(txtddno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 134, 30));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("RefNo.");
        jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 90, -1));

        btnreset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 107, -1));

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnsearch.setText("Search Rollno");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 30));

        btnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 89, 31));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Category");
        jLabel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jLabel15.setOpaque(true);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 110, 20));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Gender");
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 110, 20));
        jPanel1.add(txtcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 130, 30));
        jPanel1.add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 570, 350));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Fee Details:-");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, 20));

        stufeetable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stufeetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "Status", "Amount", "PayDate", "PayMode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        stufeetable.setColumnSelectionAllowed(false);
        stufeetable.setEditingColumn(0);
        stufeetable.setEditingRow(0);
        jScrollPane2.setViewportView(stufeetable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, 91));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    java.sql.Connection con;
         java.sql.Statement stmt;
         ResultSet rs;
         public ArrayList<User2> userList()
         {
             String roll=txtrollno.getText();
        ArrayList<User2> userList= new ArrayList<>();
         try
        {
           Class.forName("com.mysql.jdbc.Driver");
            com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/feeportal","root","password");
           if(con!=null)
             {
               com.mysql.jdbc.Statement stmt = (com.mysql.jdbc.Statement)con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from feedetails where rollno='"+roll+"'");
               User2 user;
                while(rs.next())
                {
                    
                        user = new User2(rs.getString("year"),
                                rs.getString("feestatus"),rs.getString("feeamount"),rs.getString("paydate"),rs.getString("paymode"));
                        userList.add(user);
                }
             }
       }
       catch(Exception e)
       {
           System.out.println("Exception Occured?");
           e.printStackTrace();
       }
        return userList;
    }
        public void showUser()
       {
        ArrayList<User2> list=userList();
        DefaultTableModel model=(DefaultTableModel)stufeetable.getModel();
        model.setRowCount(0);
        Object[] row=new Object[5];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getyear();
            row[1]=list.get(i).getfeestatus();
            row[2]=list.get(i).getfeeamount();
            row[3]=list.get(i).getpaydate();
            row[4]=list.get(i).getpaymode();
            
            model.addRow(row);
        }
    }
    private void rbtnonlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnonlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnonlineActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        txtrollno.setText("");
        txtsname.setText("");
        txtcourse.setText("");
        txtbranch.setText("");
        txtyear.setText("");
        txtcat.setText("");
        txtgender.setText("");
        txtfeeamount.setText("");
        txtddno.setText("");
        txtrefno.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        rbtndd.setActionCommand("DD");
        rbtncash.setActionCommand("Cash");
        rbtnonline.setActionCommand("Online");
        String rollno=txtrollno.getText();
        String sname=txtsname.getText();
        String paydate=cmbpayday.getSelectedItem()+"/"+cmbpaymonth.getSelectedItem()+"/"+cmbpayyear.getSelectedItem();
        String course=txtcourse.getText();
        String branch=txtbranch.getText();
        String year=txtyear.getText();
        String feeamount=txtfeeamount.getText();
        String feestatus=(String) cmbfeestatus.getSelectedItem();
        String paymode=buttonGroup1.getSelection().getActionCommand();
        String ddno=txtddno.getText();
        String cat=txtcat.getText();
        String gender=txtgender.getText();
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
          Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/feeportal","root","password");
           if(con!=null)
             {
               Statement stmt = (Statement)con.createStatement();
                int s=stmt.executeUpdate("insert into feedetails(rollno,sname,course,branch,year,feeamount,feestatus,paydate,paymode,ddno,catagory,gender) values('"+rollno+"','"+sname+"','"+course+"','"+branch+"','"+year+"','"+feeamount+"','"+feestatus+"','"+paydate+"','"+paymode+"','"+ddno+"','"+cat+"','"+gender+"')");
                if(s>0)
                    JOptionPane.showMessageDialog(this,"Student added in Database Successfully","Weldone!", 1);
                else
                    JOptionPane.showMessageDialog(this,"Student  not added in Database ","Weldone!", 1);
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
       AccLogin acl=new AccLogin();
       acl.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        String sname,course,branch,year,category,gender;
        String searchroll;
        searchroll=txtrollno.getText();
        showUser();
        if(searchroll.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please type Rollno to search student ","Warning?", 1);
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
                rs=stmt.executeQuery("select * from student where rollno='"+searchroll+"'");
                while(rs.next())
                {
                      // byte[] imageData=rs.getBytes("image");
                   // ImageIcon imageicon = new ImageIcon(imageData);
                        //lblphoto.setIcon(imageicon);
                        sname=rs.getString("sname");
                        course=rs.getString("course");
                        branch=rs.getString("branch");
                        year=rs.getString("sem");
                        category=rs.getString("catagory");
                        gender=rs.getString("gender");
                        txtsname.setText(sname);
                        txtcourse.setText(course);
                        txtbranch.setText(branch);
                        txtyear.setText(year);
                        txtcat.setText(category);
                        txtgender.setText(gender);
                        
                }
             }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"Something is wrong","Warning?", 1);
           System.out.println("Exception Occured?");
           e.printStackTrace();
       }
      }
    }//GEN-LAST:event_btnsearchActionPerformed

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
            java.util.logging.Logger.getLogger(FeeReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeeReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeeReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeeReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeeReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbfeestatus;
    private javax.swing.JComboBox<String> cmbpayday;
    private javax.swing.JComboBox<String> cmbpaymonth;
    private javax.swing.JComboBox<String> cmbpayyear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JRadioButton rbtncash;
    private javax.swing.JRadioButton rbtndd;
    private javax.swing.JRadioButton rbtnonline;
    private javax.swing.JTable stufeetable;
    public javax.swing.JTextField txtbranch;
    private javax.swing.JTextField txtcat;
    public javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtddno;
    private javax.swing.JTextField txtfeeamount;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtrefno;
    public javax.swing.JTextField txtrollno;
    public javax.swing.JTextField txtsname;
    public javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
