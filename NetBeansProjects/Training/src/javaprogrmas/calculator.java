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
public class calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1=sc.nextDouble();
        System.out.println("Enter second number:");
        double num2=sc.nextDouble();
        System.out.println("Choose an operator:");
        System.out.println("+: Addition");
        System.out.println("-: Subtraction");
        System.out.println("*: Multiplication");
        System.out.println("/: division");
        System.out.println("ENTER YOUR CHOICE:");
        char operator=sc.next().charAt(0);  
        double result;
        
        switch (operator){
            case '+':
                result=num1+num2;
                System.out.println("result="+result);
                break;
            case '-':
                result=num1-num2;
                System.out.println("result="+result);
                break;
            case '*':
                result=num1*num2;
                System.out.println("result="+result);
                break;
            case '/':
                if(num2!=0){
                    result=num1/num2;
                    System.out.println("result="+result);
                }else{
                    System.out.println("Error! divided by zero is not allowed");
                }
            break;
            default:
                System.out.println("INVALID OPTION! PLEASE TRY AGAIN");
        }
               
    }
}
