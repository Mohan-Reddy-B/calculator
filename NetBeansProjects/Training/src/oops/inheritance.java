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
public class inheritance {
   public static void main(String[] args){
   finalmarks v=new finalmarks();
   v.finalmarks();
   } 
}
class marks{                  //parent class
    int marks=90;
    public void getmarks(){
        System.out.println("the marks is:"+marks);
    }
}
class finalmarks extends marks{            //child class
    public void finalmarks(){
        System.out.println("marks is :"+marks);
    }
}   