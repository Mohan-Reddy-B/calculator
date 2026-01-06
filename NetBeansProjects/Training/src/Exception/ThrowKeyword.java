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
//user define Exception
public class ThrowKeyword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id: ");
        String id = sc.nextLine();
        try{
            if (id.length()!=5){
                throw new userdefine();
            }
            System.out.println("Id is: "+id);
        }catch(Exception ee){
            System.out.println("Invalid Email..........!");
        }
    }
}
class userdefine extends Exception{
    
}
