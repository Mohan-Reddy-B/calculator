/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author mohan
 */
public class methods {
    public static void main(String[] args){
        String s1 = "HeLlo";
        String s2 = "hello";
        String s3 = "HELLO";
        
        System.out.println(s1.startsWith("He"));
        System.out.println(s2.endsWith("he"));
        System.out.println(s3.contains("H"));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
