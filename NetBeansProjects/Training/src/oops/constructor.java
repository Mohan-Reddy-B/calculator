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
public class constructor {
    public static void main(String[] args){
        pen p=new pen("bright",5,"blue");
        p.write();
        p.display();
        
        System.out.println("-----------------------------------");
        
        pen pp=new pen("cell",6,"black");
        pp.display();
        
        
        
    } 
}
class pen {
    String brand;
    int price;
    String color;
    
    public pen(String brand,int price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }
    public void write(){
        System.out.println("Writing.....");
    }
    public void display(){
        System.out.println("Pen brand is:" +brand);
        System.out.println("Pen price is:" +price);
        System.out.println("pen color is:" +color);
                
    }
    
}
