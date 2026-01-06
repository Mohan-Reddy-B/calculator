/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Scanner;
/**
 *
 * @author mohan
 */
public class sumarray1 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Size of an Array:");
       int size = sc.nextInt();
       
       int []first = new int[size];
       int []second = new int[size];
       int []sum = new int[size];
       System.out.println("Enter the First Array Elements:");
       for(int i=0 ; i<size ; i++){
           first[i]=sc.nextInt();
       }
       
       System.out.println("Enter Second Array Elements:");
       for(int i = 0 ; i < size ; i++){
           second[i] = sc.nextInt();
       }
       
       System.out.println("The Sum of an Array is:");
       for(int i = 0 ; i < size ; i++){
           sum[i] = first[i] + second[i];
           System.out.println(sum[i]);
       }
   }
           
}
