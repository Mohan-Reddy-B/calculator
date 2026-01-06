/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;

/**
 *
 * @author mohan
 */
public class sumarray {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of an array;");
       int size=sc.nextInt();
       
       int []first=new int[size];
       int []second=new int[size];
       int []sum=new int[size];
       //taking input for first array
       System.out.println("Enter first array:");
       for(int i=0;i<first.length;i++){
           first[i]=sc.nextInt();
       }
       //taking input for second array
       System.out.println("Enter second array:");
       for(int i=0;i<second.length;i++){
           second[i]=sc.nextInt();
       }
       //printing the sum of given two array
       System.out.println("Sum of an array:");
       for(int i=0;i<sum.length;i++){
           sum[i]=first[i]+second[i];
           System.out.println(sum[i]);
       }
       
   } 
}
