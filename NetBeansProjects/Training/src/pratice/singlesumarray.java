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
public class singlesumarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = sc.nextInt();
        
        System.out.println("Enter first array elements:");
        int []first = new int[size];
        for (int i=0 ; i<size ; i++){
            first[i]=sc.nextInt();
        }
        
        System.out.println("Enter Second array elements:");
        int []second = new int[size];
        for (int i=0 ; i<size ; i++){
            second[i]=sc.nextInt();
        }
        
        System.out.println("Sum array");
        int []sum = new int[size];
        for(int i=0 ; i<size ; i++){
            sum[i]= first[i]+second[i];
            System.out.print(sum[i]+"\n");
        }
    }
}
