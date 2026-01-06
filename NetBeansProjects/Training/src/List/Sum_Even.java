/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;
import java.util.*;
/**
 *
 * @author mohan
 */
public class Sum_Even {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of elements: ");
       int n = sc.nextInt();
       
       List<Integer> numbers = new ArrayList<>();
       
       System.out.println("Enter: "+n+ " Elements");
       for(int i = 0 ; i < n ; i++){
         numbers.add(sc.nextInt());  
       }
       
       int sum_even = 0;
       for(int num:numbers){
          if(num%2 == 0){
              sum_even = sum_even+num;
          } 
       }
       System.out.println("Sum of even numbers in a list is: "+sum_even);
   } 
}
