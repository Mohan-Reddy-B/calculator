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
public class nothing {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Row size:");
        int row=sc.nextInt();
        System.out.println("Enter the column size");
        int column=sc.nextInt();
        
        int [][]arr1=new int[row][column];
        int [][]arr2=new int[row][column];
        int [][]sum=new int[row][column];
        
         System.out.println("Enter the first array:");
        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr1[i][j]=sc.nextInt();
                }
        }
        
        System.out.println("Enter second array:");
     for (int i=0;i<row;i++){
         for(int j=0;j<column;j++){
             arr2[i][j]=sc.nextInt();
         }
     }  
     System.out.println("Sum of both arrays:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        
    }
}
}