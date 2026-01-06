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
public class singleInheritance {         //main class
    public static void main(String[] args){  //main method
      dog d = new dog();   //creating an object
      d.sound();   //reference variable accesing the method
      d.bark();
    }
}
class animal{    //parent class
    public void sound(){    //method
      System.out.println("Animal make Sound");
    }
}
class dog extends animal{    //sub class
    public void bark(){      //method
        System.out.println("Dog barks................");
    }
}