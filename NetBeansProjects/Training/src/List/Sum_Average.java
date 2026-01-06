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
public class Sum_Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements:");
        int n = sc.nextInt();
        
        List<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter "+n+" numbers:");
        for(int i = 0 ; i < n ; i++){
            numbers.add(sc.nextInt());//if we i inside the parantheses it throw an expection
        }
        
        int sum = 0;
        //for(int i=0 ; i<n ; i++){
          //  sum= sum+numbers.get(i);
        //}
        for(int num:numbers){
            sum = sum+num;
        }
        double avg = (double) sum/n;
        System.out.println("Sum of an Given List is: "+sum);
        System.out.println("Average of the Given List is: "+avg);
    }
}
