/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author mohan
 */
public class encapsulation {
    public static void main(String[] args){
      bank b=new bank();
      b.setAccno(67543);
      System.out.println(b.getAccno());
      b.setPanno("QWEDS4546YTR");
      System.out.println(b.getPanno());
    }
         
}
class bank{
    private int accno=754987;
    private String panno="ARDS96453RT";

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getPanno() {
        return panno;
    }

    public void setPanno(String panno) {
        this.panno = panno;
    }

    void setaccno(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setanno(String qwedS4546YTR) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
