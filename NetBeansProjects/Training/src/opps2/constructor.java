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
public class constructor {
    public static void main(String[] args){
        pen1 p = new pen1("Bright" , "Blue" , 20); //calling an constructor
        p.display();
        p.write();
        
        System.out.println("------------------");
        
        pen1 pp = new pen1("cello" , "Black" , 10);
        pp.display();
        pp.write();
        
        System.out.println("--------------------");
        pen1 ppp = new pen1("Bmax" , "REd" , 7);
        ppp.display();
        ppp.write();
    }
}
class pen1{
    String name;
    String color;
    int price;
    
    public pen1(String name , String color , int price){ //creating an constructor
        this.name = name;
        this.color = color;
        this.price = price;
    }
    
    public void display(){
        System.out.println("THIS IS AN CONSTRUCTOR");
    }
    
    public void write(){
        System.out.println("Name is: "+name);
        System.out.println("Color is: "+color);
        System.out.println("Price is: "+price);
    }
}