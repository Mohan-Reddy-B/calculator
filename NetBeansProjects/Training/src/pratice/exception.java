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
public class exception {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Enter divider:");
        int d = sc.nextInt();
        String name = "";
        try{
            System.out.println(num/d);
            System.out.println(name.length());
        }catch(Exception e){
            System.out.println("You cont divide by zero");
            System.out.println("String is null");
        }
        System.out.println("rest of the code");
    }
}
