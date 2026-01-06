/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.charAt;
/**
 *
 * @author mohan
 */
public class reverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String name = sc.nextLine();
        String reverse = "";
        char ch ;
        
        for (int i=0 ; i<name.length(); i++){
            ch = name.charAt(i);
            reverse = ch + reverse;
        }
        
        System.out.println("The Reverse of a String is: "+reverse);
    }
}
