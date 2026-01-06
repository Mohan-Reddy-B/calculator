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
public class object2 {
   public static void main(String[] args){
       car c = new car();//object creation
       c.name = "swift";//by calling the reference variable
       c.price = 2000000;
       c.color = "Blue";
       c.display();
       c.write();
       
       System.out.println("______________________________");
       
       car cc = new car();
       cc.init("RD",3450000,"Red");//by using method 
       cc.display();
       cc.write();
       
   } 
}
class car{
    String name;
    double price;
    String color;
    
    public void display(){
        System.out.println("CAR--------------------");
    }
    public void init(String n, double p, String c){
        name=n;   //using method to create a variable
        price=p;
        color=c;
    }
    public void write(){
        System.out.println("Name is: "+name);
        System.out.println("Price is: "+price);
        System.out.println("Color is: "+color);
    }
}
