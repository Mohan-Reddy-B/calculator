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
public class palindromic {  //the numbers remain same whether written forward or backword
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int originalnumber=num;
        int reversenumber=0;
        
        while(num>0){
            int digit=num%10;
            reversenumber=reversenumber*10+digit;
            num /=10;
        }
        System.out.println("Reversed number="+reversenumber);
        if (originalnumber==reversenumber){
            System.out.println("the given number is palindromic number");
        }else{
            System.out.println("the given number is not palindromic number");
        }
       
    }
}
