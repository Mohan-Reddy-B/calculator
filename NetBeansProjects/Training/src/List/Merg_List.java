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
public class Merg_List {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in list1:");
        int n1 = sc.nextInt();
        
        List<Integer> list1 = new ArrayList<>();
        
        System.out.println("Enter "+n1+ " elements");
        for(int i=0 ; i<n1 ; i++){
           list1.add(sc.nextInt()); 
        }
        
        System.out.println("Enter the no. of elements in list2 ");
        int n2 = sc.nextInt();
        
        List<Integer> list2 = new ArrayList<>();
        
        System.out.println("Enter "+n2+ " elements");
        for(int i=0 ; i<n2 ; i++){
            list2.add(sc.nextInt());
        }
       
        List <Integer> merglist = new ArrayList<>(list1);
        merglist.addAll(list2);
        
        System.out.println("Merging of two list is:"+merglist);
    }
}
