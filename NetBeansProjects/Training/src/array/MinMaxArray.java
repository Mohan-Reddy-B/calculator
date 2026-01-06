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
public class MinMaxArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array:");
        int size = sc.nextInt();
        System.out.println("Enter Array elements:");
        int []arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        
       int max = arr[0];
       int min = arr[0];
       for(int i = 0 ; i < size ; i++){
           if(arr[i] > max)
               max = arr[i];
           if(arr[i] < min)
               min = arr[i];
       }
       System.out.println("Maximum of an Array is: " +max);
       System.out.println("Minimum of an Array is: "+min);
    }
    
}
