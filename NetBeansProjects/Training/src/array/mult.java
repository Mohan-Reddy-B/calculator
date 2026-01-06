/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author mohan
 */
public class mult {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter Row Size:");
      int rows = sc.nextInt();
      
      System.out.println("Enter Column Size");
      int cols = sc.nextInt();
      
      int [][]first = new int[rows][cols];
      int [][]second = new int[rows][cols];
      int [][]sum = new int[rows][cols];
      
      System.out.println("Enter first Array Elements:");
      for(int i=0 ; i<rows ; i++){
          for(int j=0 ; j<cols ; j++){
              System.out.print("Elements[ " +i+ "] [ " +j+ "] is :");
              first[i][j] = sc.nextInt();
          }
      }
      
      System.out.println("Enter Second Array Elements:");
      for (int i=0 ; i<rows ; i++){
          for( int j=0 ; j<cols ; j++){
              System.out.print("Elements[ " +i+ "] [ " +j+ "] is :");
              second[i][j] = sc.nextInt();
          }
      }
      
      System.out.println("The Sum of an given Array is:");
      for (int i=0 ; i<rows ; i++){
          for (int j=0 ; j<cols ;j++){
              sum[i][j] = first[i][j] + second[i][j];
          }
      }
      System.out.println(Arrays.deepToString(sum));
    }
}
