/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogrmas;
import java.util.Scanner;
/**
 *
 * @author mohan
 */
public class prime1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int count=0;
        
           for(int i=1; i<=num; i++){
            if (num%i==0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("The Given number is Prime");
        }else{
            System.out.println("The Given number is not prime");
        }
    }
}
