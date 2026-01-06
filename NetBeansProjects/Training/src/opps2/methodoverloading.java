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
//Same method different patrameters
public class methodoverloading {
    public static void main(String[] args){
        shape s = new shape();
        s.findarea();
        s.findarea(2);
        s.findarea(3);
        s.findarea(2, 3);
        s.findarea(3,4);
    }
}
class shape{
    public void findarea(){
        System.out.println("Areas of different Shapes.....");
    }
    public void findarea(int r){
        double cricle = 3.14*r*r;
        System.out.println("The area of cricle is: "+cricle);
    }
    public void findarea(int l , int b){
        double rectangle = l*b;
        System.out.println("The area of rectangle is: "+rectangle);
    }
    public void findarea(long b , int h){
        double triangle = 0.5*b*h;
        System.out.println("The area of triangle is: "+triangle);
    }
    public void findarea(float a){
        double square = a*a;
        System.out.println("The area of square is: "+square);
    }   
}
