/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogrmas;
import java.util.*;

/**
 *
 * @author mohan
 */
public class discount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter price");
        double price=sc.nextDouble();
        double discount;
        if (price<3000){
            discount=3;
        }else if(price<5000){
            discount=5;
        }else if(price<7000){
            discount=7;
        }else{
            discount=10;
        }
         double discount_amount=(discount/100)*price;
         double final_price= price-discount_amount;
         System.out.println("discount applied:"+discount+"%");
         System.out.println("Discount amount="+discount_amount);
         System.out.println("final price="+final_price);
        
    }
    
}
