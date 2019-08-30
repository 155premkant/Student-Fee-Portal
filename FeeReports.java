
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prem
 */
public class FeeReports extends javax.swing.JFrame {

    /**
     * Creates new form FeeReports
     */
    public FeeReports() {
        initComponents();
        showUser();
    }
     public ArrayList<User> userList()
    {
        ArrayList<User> userList= new ArrayList<>();
         try
        {
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/feeportal","root","password");
           if(con!=null)
             {
               Statement stmt = (Statement)con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from feedetails");
               User user;
                while(rs.next())
                {
                    
                        user = new User(rs.getString("rollno"),rs.getString("sname"),rs.getString("branch"),rs.getString("year"),
                                rs.getString("feestatus"),rs.getString("feeamount"),rs.getString("paydate"),rs.getString("paymode"),rs.getString("ddno"),rs.getString("catagory"),rs.getString("gender"));
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
        ArrayList<User> list=userList();
        DefaultTableModel model=(DefaultTableModel) feetable.getModel();
        Object[] row=new Object[11];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getrollno();
            row[1]=list.get(i).getsname();
            row[3]=list.get(i).getbranch();
            row[4]=list.get(i).getyear();
            row[5]=list.get(i).getfeestatus();
            row[6]=list.get(i).getfeeamount();
            row[7]=list.get(i).getpaydate();
            row[8]=list.get(i).getpaymode();
            row[9]=list.get(i).getddno();
            row[10]=list.get(i).getgender();
            row[2]=list.get(i).getcatagory();
            
            model.addRow(row);
        }
    }
    //TO SHOW USERLIST SORT BY BRANCH
    public ArrayList<User> cmbbranch1()
    {
        String br= (String)cmbbranch.getSelectedItem();
        ArrayList<User> cmbbranch1=new ArrayList<>();
         try
        {
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/feeportal","root","password");
           if(con!=null)
             {
               Statement stmt = (Statement)con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from feedetails where branch='"+br+"'");
               User user;
                while(rs.next())
                {
                    
                        user = new User(rs.getString("rollno"),rs.getString("sname"),rs.getString("branch"),rs.getString("year"),
                                rs.getString("feestatus"),rs.getString("feeamount"),rs.getString("paydate"),rs.getString("paymode"),rs.getString("ddno"),rs.getString("catagory"),rs.getString("gender"));
                        cmbbranch1.add(user);
                }
             }
       }
       catch(Exception e)
       {
           System.out.println("Exception Occured?");
           e.printStackTrace();
       }
        return cmbbranch1;
    } 
    public ArrayList<User> userListByBranch()
    {
        //String br=(String) cmbbranch.getSelectedItem();
        ArrayList<User> userListByBranch= new ArrayList<>();
         try
        {
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/feeportal","root","password");
           if(con!=null)
             {
               Statement stmt = (Statement)con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from feedetails order by branch");//branch.equals(cmbbranch.getSelectedItem())
               User user;
                while(rs.next())
                {
                    
                        user = new User(rs.getString("rollno"),rs.getString("sname"),rs.getString("branch"),rs.getString("year"),
                                rs.getString("feestatus"),rs.getString("feeamount"),rs.getString("paydate"),rs.getString("paymode"),rs.getString("ddno"),rs.getString("catagory"),rs.getString("gender"));
                        userListByBranch.add(user);
                }
             }
       }
       catch(Exception e)
       {
           System.out.println("Exception Occured?");
           e.printStackTrace();
       }
        return userListByBranch;
    } 
    //to show user list sort by catagory
    public ArrayList<User> userListByCat()
    {
        ArrayList<User> userListByCat= new ArrayList<>();
         try
        {
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/feeportal","root","password");
           if(con!=null)
             {
               Statement stmt = (Statement)con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from feedetails order by catagory");
               User user;
                while(rs.next())
                {
                    
                        user = new User(rs.getString("rollno"),rs.getString("sname"),rs.getString("branch"),rs.getString("year"),
                                rs.getString("feestatus"),rs.getString("feeamount"),rs.getString("paydate"),rs.getString("paymode"),rs.getString("ddno"),rs.getString("catagory"),rs.getString("gender"));
                        userListByCat.add(user);
                }
             }
       }
       catch(Exception e)
       {
           System.out.println("Exception Occured?");
           e.printStackTrace();
       }
        return userListByCat;
    } 
    //to show user list sort by Studeny'year
    public ArrayList<User> userListByYear()
    {
        ArrayList<User> userListByYear= new ArrayList<>();
         try
        {
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/feeportal","root","password");
           if(con!=null)
             {
               Statement stmt = (Statement)con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from feedetails order by year ");
               User user;
                while(rs.next())
                {
                    
                        user = new User(rs.getString("rollno"),rs.getString("sname"),rs.getString("branch"),rs.getString("year"),
                                rs.getString("feestatus"),rs.getString("feeamount"),rs.getString("paydate"),rs.getString("paymode"),rs.getString("ddno"),rs.getString("catagory"),rs.getString("gender"));
                        userListByYear.add(user);
                }
             }
       }
       catch(Exception e)
       {
           System.out.println("Exception Occured?");
           e.printStackTrace();
       }
        return userListByYear;
    } 
    //to show user list sort by catagory
    public ArrayList<User> userListByPaymode()
    {
        ArrayList<User> userListByPaymode= new ArrayList<>();
         try
        {
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/feeportal","root","password");
           if(con!=null)
             {
               Statement stmt = (Statement)con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from feedetails order by paymode");
               User user;
                while(rs.next())
                {
                    
                        user = new User(rs.getString("rollno"),rs.getString("sname"),rs.getString("branch"),rs.getString("year"),
                                rs.getString("feestatus"),rs.getString("feeamount"),rs.getString("paydate"),rs.getString("paymode"),rs.getString("ddno"),rs.getString("catagory"),rs.getString("gender"));
                        userListByPaymode.add(user);
                }
             }
       }
       catch(Exception e)
       {
           System.out.println("Exception Occured?");
           e.printStackTrace();
       }
        return userListByPaymode;
    } 
     public ArrayList<User> userListBygender()
    {
        ArrayList<User> userListBygender= new ArrayList<>();
         try
        {
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/feeportal","root","password");
           if(con!=null)
             {
               Statement stmt = (Statement)con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from feedetails order by gender");
               User user;
                while(rs.next())
                {
                    
                        user = new User(rs.getString("rollno"),rs.getString("sname"),rs.getString("branch"),rs.getString("year"),
                                rs.getString("feestatus"),rs.getString("feeamount"),rs.getString("paydate"),rs.getString("paymode"),rs.getString("ddno"),rs.getString("catagory"),rs.getString("gender"));
                        userListBygender.add(user);
                }
             }
       }
       catch(Exception e)
       {
           System.out.println("Exception Occured?");
           e.printStackTrace();
       }
        return userListBygender;
    }
      public ArrayList<User> userListByPaydate()
    {
        ArrayList<User> userListByPaydate= new ArrayList<>();
         try
        {
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/feeportal","root","password");
           if(con!=null)
             {
               Statement stmt = (Statement)con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from feedetails order by paydate");
               User user;
                while(rs.next())
                {
                    
                        user = new User(rs.getString("rollno"),rs.getString("sname"),rs.getString("branch"),rs.getString("year"),
                                rs.getString("feestatus"),rs.getString("feeamount"),rs.getString("paydate"),rs.getString("paymode"),rs.getString("ddno"),rs.getString("catagory"),rs.getString("gender"));
                        userListByPaydate.add(user);
                }
             }
       }
       catch(Exception e)
       {
           System.out.println("Exception Occured?");
           e.printStackTrace();
       }
        return userListByPaydate;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        feetable = new javax.swing.JTable();
        btnfeereports = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnsortyear = new javax.swing.JButton();
        btnsortcatagory = new javax.swing.JButton();
        cmbbranch = new javax.swing.JComboBox<>();
        cmbyear = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        cmbpaymode = new javax.swing.JComboBox<>();
        btnsortmode = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbpaymode1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        feetable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        feetable.setForeground(new java.awt.Color(0, 102, 102));
        feetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rollno", "Sname", "Catagory", "Branch", "year", "FeeStatus", "Fee Amount", "Pay Date", "Paymode", "DD/Ref No", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        feetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(feetable);

        btnfeereports.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnfeereports.setForeground(new java.awt.Color(0, 102, 102));
        btnfeereports.setText("Sort By Branch");
        btnfeereports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfeereportsActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnback.setForeground(new java.awt.Color(0, 102, 102));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(0, 102, 102));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnsortyear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsortyear.setForeground(new java.awt.Color(0, 102, 102));
        btnsortyear.setText("Sort By Year");
        btnsortyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortyearActionPerformed(evt);
            }
        });

        btnsortcatagory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsortcatagory.setForeground(new java.awt.Color(0, 102, 102));
        btnsortcatagory.setText("Sort By Catagory");
        btnsortcatagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortcatagoryActionPerformed(evt);
            }
        });

        cmbbranch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbbranch.setForeground(new java.awt.Color(0, 102, 102));
        cmbbranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "ECE", "MAE", " " }));
        cmbbranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbranchActionPerformed(evt);
            }
        });

        cmbyear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbyear.setForeground(new java.awt.Color(0, 102, 102));
        cmbyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIRST YEAR", "SECOND YEAR", "THIRD YEAR", "FINAL YEAR" }));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 102, 102));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GEN", "OBC", "SC/ST", "OTHER" }));

        cmbpaymode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbpaymode.setForeground(new java.awt.Color(0, 102, 102));
        cmbpaymode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", " " }));

        btnsortmode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsortmode.setForeground(new java.awt.Color(0, 102, 102));
        btnsortmode.setText("Sort By Paymode");
        btnsortmode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortmodeActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Sort By Gender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Sort By PayDate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cmbpaymode1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbpaymode1.setForeground(new java.awt.Color(0, 102, 102));
        cmbpaymode1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ONLINE", "CHEQUE", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(btnfeereports, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(cmbbranch, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsortyear, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsortcatagory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsortmode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbpaymode1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(cmbpaymode, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnfeereports, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsortyear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsortcatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsortmode, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbpaymode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbbranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbpaymode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        AdminForm af=new AdminForm();
        af.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnfeereportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfeereportsActionPerformed
        ArrayList<User> list=userListByBranch();
        DefaultTableModel model=(DefaultTableModel) feetable.getModel();
        model.setRowCount(0);
        Object[] row=new Object[11];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getrollno();
            row[1]=list.get(i).getsname();
            row[3]=list.get(i).getbranch();
            row[4]=list.get(i).getyear();
            row[5]=list.get(i).getfeestatus();
            row[6]=list.get(i).getfeeamount();
            row[7]=list.get(i).getpaydate();
            row[8]=list.get(i).getpaymode();
            row[9]=list.get(i).getddno();
            row[10]=list.get(i).getgender();
            row[2]=list.get(i).getcatagory();
            
            model.addRow(row);
        }
    }//GEN-LAST:event_btnfeereportsActionPerformed

    private void btnsortcatagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortcatagoryActionPerformed
       ArrayList<User> list=userListByCat();
        DefaultTableModel model=(DefaultTableModel) feetable.getModel();
        model.setRowCount(0);
        Object[] row=new Object[11];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getrollno();
            row[1]=list.get(i).getsname();
            row[3]=list.get(i).getbranch();
            row[4]=list.get(i).getyear();
            row[5]=list.get(i).getfeestatus();
            row[6]=list.get(i).getfeeamount();
            row[7]=list.get(i).getpaydate();
            row[8]=list.get(i).getpaymode();
            row[9]=list.get(i).getddno();
            row[10]=list.get(i).getgender();
            row[2]=list.get(i).getcatagory();
            
            model.addRow(row);
        }
    }//GEN-LAST:event_btnsortcatagoryActionPerformed

    private void btnsortyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortyearActionPerformed
        ArrayList<User> list=userListByYear();
        DefaultTableModel model=(DefaultTableModel) feetable.getModel();
        model.setRowCount(0);
        Object[] row=new Object[11];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getrollno();
            row[1]=list.get(i).getsname();
            row[3]=list.get(i).getbranch();
            row[4]=list.get(i).getyear();
            row[5]=list.get(i).getfeestatus();
            row[6]=list.get(i).getfeeamount();
            row[7]=list.get(i).getpaydate();
            row[8]=list.get(i).getpaymode();
            row[9]=list.get(i).getddno();
            row[10]=list.get(i).getgender();
            row[2]=list.get(i).getcatagory();
            
            model.addRow(row);
        }
    }//GEN-LAST:event_btnsortyearActionPerformed

    private void btnsortmodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortmodeActionPerformed
        ArrayList<User> list=userListByPaymode();
        DefaultTableModel model=(DefaultTableModel) feetable.getModel();
        model.setRowCount(0);
        Object[] row=new Object[11];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getrollno();
            row[1]=list.get(i).getsname();
            row[3]=list.get(i).getbranch();
            row[4]=list.get(i).getyear();
            row[5]=list.get(i).getfeestatus();
            row[6]=list.get(i).getfeeamount();
            row[7]=list.get(i).getpaydate();
            row[8]=list.get(i).getpaymode();
            row[9]=list.get(i).getddno();
            row[10]=list.get(i).getgender();
            row[2]=list.get(i).getcatagory();
            
            model.addRow(row);
        }
    }//GEN-LAST:event_btnsortmodeActionPerformed

    private void feetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feetableMouseClicked
         FeeReport sd=new FeeReport();
      int index=feetable.getSelectedRow();
      TableModel tmodel=feetable.getModel();
      String rollno=tmodel.getValueAt(index,0).toString();
      String sname=tmodel.getValueAt(index,1).toString();
      String branch=tmodel.getValueAt(index,3).toString();
      if(!rollno.equals("")||!sname.equals("")||!branch.equals(""))
            {
                sd.setVisible(true);
                sd.txtrollno.setText(rollno);
                sd.txtsname.setText(sname);
                sd.txtbranch.setText(branch);
                this.setVisible(false);
            }
    }//GEN-LAST:event_feetableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     ArrayList<User> list=userListBygender();
        DefaultTableModel model=(DefaultTableModel) feetable.getModel();
        model.setRowCount(0);
        Object[] row=new Object[11];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getrollno();
            row[1]=list.get(i).getsname();
            row[3]=list.get(i).getbranch();
            row[4]=list.get(i).getyear();
            row[5]=list.get(i).getfeestatus();
            row[6]=list.get(i).getfeeamount();
            row[7]=list.get(i).getpaydate();
            row[8]=list.get(i).getpaymode();
            row[9]=list.get(i).getddno();
            row[10]=list.get(i).getgender();
            row[2]=list.get(i).getcatagory();
            
            model.addRow(row);
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     ArrayList<User> list=userListByPaydate();
        DefaultTableModel model=(DefaultTableModel) feetable.getModel();
        model.setRowCount(0);
        Object[] row=new Object[11];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getrollno();
            row[1]=list.get(i).getsname();
            row[3]=list.get(i).getbranch();
            row[4]=list.get(i).getyear();
            row[5]=list.get(i).getfeestatus();
            row[6]=list.get(i).getfeeamount();
            row[7]=list.get(i).getpaydate();
            row[8]=list.get(i).getpaymode();
            row[9]=list.get(i).getddno();
            row[10]=list.get(i).getgender();
            row[2]=list.get(i).getcatagory();
            
            model.addRow(row);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbranchActionPerformed
    ArrayList<User> list=cmbbranch1();
        DefaultTableModel model=(DefaultTableModel) feetable.getModel();
        model.setRowCount(0);
        Object[] row=new Object[11];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getrollno();
            row[1]=list.get(i).getsname();
            row[3]=list.get(i).getbranch();
            row[4]=list.get(i).getyear();
            row[5]=list.get(i).getfeestatus();
            row[6]=list.get(i).getfeeamount();
            row[7]=list.get(i).getpaydate();
            row[8]=list.get(i).getpaymode();
            row[9]=list.get(i).getddno();
            row[10]=list.get(i).getgender();
            row[2]=list.get(i).getcatagory();
            
            model.addRow(row);
        }
    }//GEN-LAST:event_cmbbranchActionPerformed

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
            java.util.logging.Logger.getLogger(FeeReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeeReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeeReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeeReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeeReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnfeereports;
    private javax.swing.JButton btnsortcatagory;
    private javax.swing.JButton btnsortmode;
    private javax.swing.JButton btnsortyear;
    private javax.swing.JComboBox<String> cmbbranch;
    private javax.swing.JComboBox<String> cmbpaymode;
    private javax.swing.JComboBox<String> cmbpaymode1;
    private javax.swing.JComboBox<String> cmbyear;
    private javax.swing.JTable feetable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
