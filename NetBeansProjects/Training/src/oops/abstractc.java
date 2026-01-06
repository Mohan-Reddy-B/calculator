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
public class abstractc {
    public static void main(String[] args){
     mobile1 mb=new mobile1();
     mb.mob();
     mb.call();
     mb.camera();
     mb.message();
     mb.mobilinfo();
    }
           
}
abstract class mobile{
  abstract  public void camera();
  abstract public void call();
  abstract public void message(); 
  public void mob(){
      System.out.println("MOBILE INFO");
  }
}
class mobile1 extends mobile{
    String name="Samsung";
    int price=20456;
    
    @Override
    public void camera() {
    System.out.println("camera features");    
    }

    @Override
    public void call() {
        System.out.println("call features");
    }

    @Override
    public void message() {
        System.out.println("Message features");
    }
  public void mobilinfo(){
      System.out.println("Mobil name is :"+name);
      System.out.println("Price is :"+price);
  }  
}