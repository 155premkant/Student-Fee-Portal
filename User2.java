/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prem
 */
class User2 {
    public String year,feestatus,feeamount,paydate,paymode;
     public User2(String year,String feestatus,String feeamount,String paydate,String paymode)
     {
         this.year=year;
         this.feestatus=feestatus;
         this.feeamount=feeamount;
         this.paydate=paydate;
         this.paymode=paymode;
     }

    //User2(String string, String string0, String string1, String string2, String string3) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
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
}
