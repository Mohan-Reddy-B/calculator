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
public class Sort_list {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no of elements");
       int n = sc.nextInt();
       
       System.out.println("Enter "+n+" elements");
       List<Integer> numbers = new LinkedList<>();
       for(int i=0 ; i<n ; i++){
           numbers.add(sc.nextInt());
       }
       Collections.sort(numbers);
       System.out.println("Asscending order of a list is: "+numbers);
       
       Collections.sort(numbers, Collections.reverseOrder());
       System.out.println("Descending order of a list is:"+numbers);
   } 
}
