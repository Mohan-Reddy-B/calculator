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
public class Revers_list {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter "+n+" elements");
        for(int i=0 ; i<n ; i++){
            numbers.add(sc.nextInt());
        }
        List<Integer> reverselist = new ArrayList<>(numbers);
        Collections.reverse(reverselist);
        System.out.println("Reverse is"+reverselist);
    }
}
