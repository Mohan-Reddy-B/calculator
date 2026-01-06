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
//same method same parameter same return type
public class overriding {
   public static void main(String[] args){
     shape1  s = new shape1();     // Base class
        s.area();             // prints "Area is Given by:"

        s = new cricle(5);    // Polymorphic reference
        s.area();             // calls cricle.area()

        s = new rectangle(4, 6); // Polymorphic reference
        s.area();             // calls rectangle.area()
      
   } 
}
class shape1{
    public void area(){ //method
        System.out.println("Area is Given by:");
    }
}
class cricle extends shape1{
    double radius;
    public cricle(double r){  //constructor
        radius = r;
    }
    @Override
    public void area(){  //method
        double cir = 3.14*radius*radius;
       System.out.println("Area of cricle is: "+cir);
    }
}
class rectangle extends shape1{
    double length , breath;
    public rectangle(double l , double b){  //constructor
        length = l;
        breath = b;
    }
    @Override
    public void area(){ //method
     double rect = length*breath;
     System.out.println("The area of rectangle is: "+rect  );
    }
}
