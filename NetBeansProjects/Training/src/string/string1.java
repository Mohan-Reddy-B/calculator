/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;
import java.util.Scanner;
/**
 *
 * @author mohan
 */
public class string1 {
    public static void main(String[] args){
        //String s1 = "Mohan ";
        //String s2 = " Reddy";
        //String s3 = " B ";
        
        //System.out.println(s1+s2+s3);
        
        //String s4 = "Hello";// stroded in sring pool
        //String s5;
        //s5 = new String("Hello");// Stored in heap memory
        //String s6 = "Hello";
        //String s7 = new String("Hello");
        //(==) it verifies the address
        //System.out.println(s4 == s5);//these strings stored in different memory
        //System.out.println(s4 == s6);
        //System.out.println(s5 == s7);
        //because in heap memory the irrespective of data has been stored
        //System.out.println(s4.equals(s5));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println(name);
    }
}

