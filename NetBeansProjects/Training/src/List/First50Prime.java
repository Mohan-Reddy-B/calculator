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
public class First50Prime {
    public static void main(String[] args){
        List<Integer> prime = new ArrayList<>();
        int number = 2;
        
        while(number<=50){
            List<Integer> divisor = new ArrayList<>();
            
            for(int i=1 ; i<=number ; i++){
                if(number%i == 0){
                    divisor.add(i);
                }
            }
            if(divisor.size() == 2){
                prime.add(number);
            }
            number++;
        }
        System.out.println("The first 50 prime numbers are:");
        System.out.println(prime);
    }
}
