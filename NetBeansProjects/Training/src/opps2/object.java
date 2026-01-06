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
public class object {
   public static void main(String[] args){ //main method
       pen p = new pen(); //object creation
       p.init("Cello" , 12 , "Black");
       p.display(); //accesing the method
       p.write();
   } 
}
class pen{   //creating class
    String name = "Bright";  //variable 1
    int price = 5;           //variable 2
    String color = "Blue";   //variable 3

  public void  init(String n, int p, String c) {
        name = n;
        price = p;
        color = c;
    }
    
public void display(){    //creating an method 1
    System.out.println("Writing!!!!!!!!!!!!!");
}    
            
public void write(){    //creating an method 2
    System.out.println("Name is: "+name);
    System.out.println("Price is: "+price);
    System.out.println("Color is: "+color);
     }
}
