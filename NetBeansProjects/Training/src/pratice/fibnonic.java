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
public class fibnonic {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      int first = 0;
      int second =1;
      int fib ;
      for (int i=0;i<=num;i++){
          System.out.println(first+" , ");
          fib = first+second;
          first = second;
          second = fib;
      }
    }
}
