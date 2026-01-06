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
public class palindromicString {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String name = sc.nextLine();
        String reverse = "";
        char ch;
        
        for(int i=0 ; i<name.length() ; i++){
            ch = name.charAt(i);
            reverse = ch + reverse;
        }
        
        System.out.println("The Revese of a String is:"+reverse);
        
        if(reverse.equalsIgnoreCase(name)){ //it ignores case sensitive
            System.out.println("The Given Number is Palindromic");
        }else{
            System.out.println("The Given Number is Not Palindromic");
        }
    }
}
