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
public class object {

    public static void main(String[] args) {
        car c = new car();         //object
         // c.brand = "BMW";
        // c.color = "blue";
        // c.price = 5000000;
        c.init("BMW",5000000,"BLUE");
         c.write();
         c.display();

        System.out.println("-----------------");

        car cc = new car();        //object
        //cc.brand = "RD";
        //cc.price = 4000000;
        //cc.color = "White";
        cc.init("RD",40000,"RED");
        cc.display();

    }
}

class car {               //class

    String brand;
    double price;
    String color;

    public void write() {               //method
        System.out.println("CARS.....");
    }
    public void init(String b,double p,String c){  //method
        brand=b;
        price=p;
        color=c;
        
    }
    public void display() {            //method
        System.out.println("The car brand is:" + brand);
        System.out.println("the car price is:" + price);
        System.out.println("the car clor is:" + color);
    }
}
