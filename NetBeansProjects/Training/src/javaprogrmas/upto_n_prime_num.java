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
public class upto_n_prime_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("upto "+n+ " prime numbers are: ");
        for(int i=2 ; i<=n ; i++){
            int count = 0;
            for(int j=1 ; j<=i ; j++){
                if(i%j == 0)
                    count++;
            }
            if(count == 2){
                System.out.println(" "+i);
            }
        }
    }
}
