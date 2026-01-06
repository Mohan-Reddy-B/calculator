/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

/**
 *
 * @author mohan
 */
public class overloading {
  public static void main(String[] args){
      shape s = new shape();
      s.findarea();
      s.findarea( 1.3);
      s.findarea(2,3);
      s.findarea(4);
  }  
}
class shape{
    public void findarea(){
        System.out.println("AREA OF DIFFERENT SHAPES......");
    }
    public void findarea(int r){
        double cricle = 3.14*r*r;
        System.out.println("Area of cricle:"+cricle);
    }
    public void findarea(int l , int b){
        double rectangle = l*b;
        System.out.println("Area of rectangle:"+rectangle);
    }
    public void findarea(double a){
        double square = a*a;
        System.out.println("Area of square is:"+square);
    }
}