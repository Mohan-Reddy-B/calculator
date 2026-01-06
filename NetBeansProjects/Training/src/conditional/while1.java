/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;
import java.util.*;
/**
 *
 * @author mohan
 */
public class while1 {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number:");
       int num = sc.nextInt();
       int mult=1;//reverse rev=0;
       int rem;
  
       while(num!=0){
           rem = num%10;
           mult = mult*rem;//rev=rev*10+rem;
           num = num/10;
       }
       System.out.println("the product of the given Number is:"+mult);
   } 
}
