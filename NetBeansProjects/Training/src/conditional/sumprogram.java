/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;

/**
 *
 * @author mohan
 */
public class sumprogram {
    public static void main(String[] args){
        int num=65;
        int rev=0;
        int rem;
        while(num!=0){
          rem=num%10;
          rev=rev*10+rem;
          num=num/10;
          
        }
        System.out.println("the reverse is: "+rev);
    }
    
}
