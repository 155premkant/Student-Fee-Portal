/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prem
 */
class User {
    public String rollno,sname,branch,year,feestatus,feeamount,paydate,paymode,ddno,catagory,gender;
     public User(String rollno,String sname, String branch, String year,String feestatus,String feeamount,String paydate,String paymode,String ddno,String catagory,String gender)
     {
         this.rollno=rollno;
         this.sname=sname;
         this.branch=branch;
         this.year=year;
         this.feestatus=feestatus;
         this.feeamount=feeamount;
         this.paydate=paydate;
         this.paymode=paymode;
         this.ddno=ddno;
         this.catagory=catagory;
         this.gender=gender;
     }

    User(String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public String getrollno()
     {
            return rollno;
     }
     public String getsname()
     {
            return sname;
     }
     public String getcatagory()
     {
            return catagory;
     }
     public String getbranch()
     {
            return branch;
     }
     public String getyear()
     {
            return year;
     }
     public String getfeestatus()
     {
            return feestatus;
     }
     public String getfeeamount()
     {
            return feeamount;
     }
     public String getpaydate()
     {
            return paydate;
     }
     public String getpaymode()
     {
            return paymode;
     }
     public String getddno()
     {
            return ddno;
     }
     public String getgender()
     {
            return gender;
     }
}
