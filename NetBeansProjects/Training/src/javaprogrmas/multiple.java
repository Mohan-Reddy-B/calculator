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
public class multiple {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit=sc.nextInt();
        int num=7;
        
        for(int i=1;i<=limit;i++){
            System.out.println(num + " * " + i + " = "+(num*i));
        }
    }
}
