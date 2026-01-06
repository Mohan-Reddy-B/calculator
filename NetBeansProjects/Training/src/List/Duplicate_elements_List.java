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
public class Duplicate_elements_List {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n = sc.nextInt();
        
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter "+n+" Elements:");
        for(int i = 0 ; i < n ; i++){
            numbers.add(sc.nextInt());
        }
        
        System.out.println("Duplicate elments are:");
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(Objects.equals(numbers.get(i), numbers.get(j))){
                    System.out.println(numbers.get(j));
                }
            }
        }
    }
}
