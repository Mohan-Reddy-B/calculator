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
public class Split_List {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out .println("Enter no of elements:");
        int n = sc.nextInt();
        
        List<Integer> numbers = new ArrayList();
        
        System.out.println("Enter "+n+" elements");
        for(int i=0 ; i<n ; i++){
            numbers.add(sc.nextInt());
        }
        
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        for(int num:numbers){
            if(num%2 == 0){
                even.add(num);
            }else{
                odd.add(num);
            }
        }
        System.out.println("Even list: "+even);
        System.out.println("Odd list: "+odd);
    }
}
