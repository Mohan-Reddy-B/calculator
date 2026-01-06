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
public class methodoverloading {
    public static void main(String[] args){
       shape p=new shape();
       p.findarea();
       p.findarea(6);
       p.findarea(3,4);
       p.findarea(3,3);
    }
}
class shape{
    public void findarea(){
        System.out.println("find the shape");
    }
    public void findarea(int r){
        double circle=3.14*r*r;
        System.out.println("Area of circle is:"+circle);
    }
    public void findarea(int l,int b){
        double rect=l*b;
        System.out.println("Area of rectangle is:"+rect);
    }
    public void findarea(double b , double h){
        double triangle=1/2*b*h;
        System.out.println("Area of triangle is:"+triangle);
    }
}