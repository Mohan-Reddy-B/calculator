/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opps2;

/**
 *
 * @author mohan
 */
public class Encapsulation {
    public static void main(String[] args){
        bank k = new bank();
        k.setAccn(122333);
        System.out.println(k.getAccn());
        k.setPanno("AEWQ2367NH67");
        System.out.println(k.getPanno());
    }
}
class bank{
    int accn = 76456;
    String panno = "ABC5647BRE";
//alt+insert and press getter and setter method
    public int getAccn() {
        return accn;
    }

    public void setAccn(int accn) {
        this.accn = accn;
    }

    public String getPanno() {
        return panno;
    }

    public void setPanno(String panno) {
        this.panno = panno;
    }
}