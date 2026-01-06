/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author mohan
 */
public class array2 {
    public static void main(String[] args){
     //   int array[]=new int[10];
      //  for(int i=0;i<array.length;i++){
      //      array[i]=i+1;
        //    System.out.println(array[i]);
        //}
        int []even={2,4,3,6,5,8,9};
        for(int i=0;i<even.length;i++){
            if(even[i]%2==0){
                System.out.println(even[i]);
            }
        }
    }
}
