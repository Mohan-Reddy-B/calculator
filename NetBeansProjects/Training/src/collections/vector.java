/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.*;
/**
 *
 * @author mohan
 */
public class vector {
    public static void main(String[] args){
        Vector <String>v = new Vector<>();
        v.add("Mohan");
        v.add("Vijay");
        v.add("Suresh");
        System.out.println(v);
        System.out.println("Size :"+v.size());
        System.out.println("capacity: "+v.capacity());
        Vector <String>v1 = new Vector<>();
        v1.add("Kiran");
        v1.add("Sagar");
        System.out.println(v1);
        v1.addAll(v);
        System.out.println(v1);
        v1.get(0);
        System.out.println(v1);
        v1.set(1, "Alya");
        v1.set(2, "Hinata");
        System.out.println(v1);
        v1.remove(0);
        v1.removeAll(v);
        System.out.println(v1);
        System.out.println(v1.contains("Alya"));
    }
    
}
