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
//hiding the implimentation data only showing funcanility data
public class abstractKeyword {
    public static void main(String[] args){
        mobil1 mb = new mobil1();
        mb.mbinfo();
        mb.mobilinfo();
        mb.cammara();
        mb.call();
        mb.Message();
    }
}
abstract class mobil{
    abstract public void cammara();
    abstract public void call();
    abstract public void Message();
    
    public void mbinfo(){
        System.out.println("MOBILE INFORMATION.......");
    }
} 
class mobil1 extends mobil{
    String name = "Samsung";
    int price = 23000;
    
    public void mobilinfo(){
        System.out.println("Mobil Name is : "+name);
        System.out.println("Mobil price is : "+price);
    }

    @Override
    public void cammara() {
       System.out.println("CAMMARA FEATURES..........");
    }

    @Override
    public void call() {
       System.out.println("CALL FEATURES.............");
    }

    @Override
    public void Message() {
       System.out.println("MESSAGE FEATURES...........");
    }
}
    
