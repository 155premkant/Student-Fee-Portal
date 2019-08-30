/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prem
 */
class User1 {
    String roll,sname,dob,course,branch,sem,cetrank,email,contact,gender,adrs;
     public User1(String roll,String sname,String dob,String course, String branch, String sem,String cetrank,String email,String contact,String gender,String adrs)
     {
         this.roll=roll;
         this.sname=sname;
         this.dob=dob;
         this.course=course;
         this.branch=branch;
         this.sem=sem;
         this.email=email;
         this.contact=contact;
         this.gender=gender;
         this.adrs=adrs;
     }
     public String getrollno()
     {
            return roll;
     }
     public String getsname()
     {
            return sname;
     }
     public String getdob()
     {
            return dob;
     }
     public String getcourse()
     {
            return course;
     }
     public String getbranch()
     {
            return branch;
     }
     public String getsem()
     {
            return sem;
     }
      public String getcetrank()
     {
            return cetrank;
     }
     public String getemail()
     {
            return email;
     }
     public String getcontact()
     {
            return contact;
     }
     public String getgender()
     {
            return gender;
     }
     public String getadrs()
     {
            return adrs;
     }
}
