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
public class inheritance {
   public static void main(String[] args){
     finalmarks v = new finalmarks();
     v.finalmarks();
   } 
}
class marks{
    int marks = 100;
    public void getmarks(){
        System.out.println("The Marks is "+marks);
    }
}
class finalmarks extends marks{
    public void finalmarks(){
        System.out.println("The marks is "+marks);
    }
}