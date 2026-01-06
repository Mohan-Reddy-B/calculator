/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;

/**
 *
 * @author mohan
 */
public class multiarray {
   public static void main(String[] args){
       int [][]multi=new int[2][2];
       multi[0][0]=2;
       multi[0][1]=4;
       multi[1][0]=6;
       multi[1][1]=8;
       
      // System.out.println(multi[1][1]);
       
       for(int i=0;i<multi.length;i++){
           for(int j=0;j<multi.length;j++){
               System.out.print(multi[i][j]+" ");
           }
           System.out.println("");
       }
       System.out.println(Arrays.deepToString(multi));
   } 
}
