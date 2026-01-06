/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;
import java.util.Scanner;
/**
 *
 * @author mohan
 */
public class AException {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Divident: ");
       int num = sc.nextInt();
       System.out.println("Enter divider: ");
       int div = sc.nextInt();
       try{
       System.out.println("Result is: "+num/div);
       } catch(ArithmeticException e){
           System.out.println("YOU CAN'T DIVIDE BY ZERO");
       }
       System.out.println("CODE BUILT SUCESSFULLY~~~~~~~~~~~~~~~~~~");
   } 
}
