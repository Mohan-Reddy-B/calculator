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
public class ArrayReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int size = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int []arr = new int[size];
        
        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0 ; i<size/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i] = temp;
        }
        
        System.out.println("Reverse of an Array: ");
        for(int i = 0 ; i<size ; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
