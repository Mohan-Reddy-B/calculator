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
public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int reverse = 0;
        int rem;
        int original = num;
        while(num>0){
            rem = num%10;
            reverse = reverse*10+rem;
            num = num/10;
        }
       
        if(original == reverse ){
            System.out.println("given number is palndromic");
        }else{
            System.out.println("Given number is not palndromic");
        }
    }
}
