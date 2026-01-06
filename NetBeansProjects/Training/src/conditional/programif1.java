/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;

import java.util.Scanner;

/**
 *
 * @author mohan
 */
public class programif1 {
   public static void main (String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the age");
       int age=sc.nextInt();
       if(age>18){
           System.out.println("Eligible for Vote"+age);
       }else if(age==18){
           System.out.println("Right age to vote"+age);
       }else{
           System.out.println("Not eligible for vote");
       }
   } 
}
