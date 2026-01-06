/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogrmas;
import java.util.*;

/**
 *
 * @author mohan
 */
public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        
        long fact=1;
        for(int i=1 ; i<=num ; i++){
            fact*=i;
        }
        System.out.println("The Factorial " + num + " is : " + fact);
    }
}
