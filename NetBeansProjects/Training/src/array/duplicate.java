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
public class duplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter an Array");
        int []arr = new int[size];
        for(int i=0 ; i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Duplicated array elements are:");
        for (int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
