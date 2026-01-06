/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogrmas;
import java.util.Scanner;
/**
 *
 * @author mohan
 */
public class fibonacci {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Number");
       int num = sc.nextInt();
       int first=0 , second = 1;
       int next;
       
       for(int i = 1 ; i<=num ; i++){
           System.out.print(first+ " , ");
           next = first+second;
           first = second;
           second = next;
       }
   } 
}
