/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;
import java.util.Scanner;
/**
 *
 * @author mohan
 */
public class NException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = null;
        System.out.println("Enter Divider: ");
        int num = sc.nextInt();
        System.out.println("Enter Divident: ");
        int div = sc.nextInt();
        
        try{
            System.out.println("The length of String is: "+name.length());
            System.out.println("The Result is: "+num/div);
        }catch(NullPointerException e){
            System.out.println("You Con't find the length for null String");
        }catch(ArithmeticException e){
            System.out.println("You cant divide by zero");
        }
        System.out.println("Rest of the code.......");
    }
}
