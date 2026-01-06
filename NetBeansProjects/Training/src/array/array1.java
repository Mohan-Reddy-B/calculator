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
public class array1 {
    public static void main(String[] args){
        int []ar=new int[5];//type 1
        ar[0]=10;
        ar[1]=20;
        ar[2]=30;
        ar[3]=40;
        ar[4]=50;
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
        for(int elements:ar){
            System.out.println(elements);
        }
               
        
        int []arr={1,2,3,4,5};//type 2
        System.out.println(Arrays.toString(arr));
        System.out.println("the length of an array:"+arr.length);
        System.out.println(arr[2]);
        System.out.println(arr.length-1);
    }
}
