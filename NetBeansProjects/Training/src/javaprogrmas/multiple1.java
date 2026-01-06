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
public class multiple1 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Limit:");
       int limit = sc.nextInt();
       System.out.println("Enter The Number:");
       int num = sc.nextInt();
       
       for(int i=1 ; i<=limit ; i++){
           System.out.println(num+ " * " +i+ " = " +(num*i));
       }
   } 
}
