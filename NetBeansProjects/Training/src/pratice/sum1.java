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
public class sum1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int num = sc.nextInt();
        int rem=0;
        int sum=0;
        while(num!=0){
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        System.out.println("the sum of the number is:"+sum);
    }
}
