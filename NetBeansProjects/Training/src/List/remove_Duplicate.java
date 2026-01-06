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
public class remove_Duplicate {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number of elements: ");
       int n = sc.nextInt();
       
       List<Integer> numbers = new ArrayList<>();
       System.out.println("enter "+n+" elements");
       for(int i=0 ; i<n ; i++){
       numbers.add(sc.nextInt());
       }
       
       System.out.println("Duplicate elements are:");
       for(int i = 0 ; i<numbers.size() ; i++){
           for(int j=i+1 ; j<numbers.size() ; j++){
               if(Objects.equals(numbers.get(i),numbers.get(j))){
                   numbers.remove(j);
               }
           }
       }
       System.out.println("List without Duplicate elements"+numbers);
   } 
}
