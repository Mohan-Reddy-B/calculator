/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;
import java.util.Scanner;
/**
 *
 * @author mohan
 */
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i<size ; i++){
            arr[i]=sc.nextInt();
        if(arr[i]%2==0){
            System.out.println(arr[i]);
        }
    }
}
}