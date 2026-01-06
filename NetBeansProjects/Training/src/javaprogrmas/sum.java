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
public class sum {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        int sum=0;
        
        for(int i=0 ; i<=num ; i++){
            sum=sum+i;
        }
        System.out.println("The Sum is:"+sum);
    }
}
