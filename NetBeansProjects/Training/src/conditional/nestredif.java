/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;
import java.util.*;

/**
 *
 * @author mohan
 */
public class nestredif {
    public static void main(String[] args){
        String username;
        String password;
        
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter user name:");
      username=sc.next();
      
      System.out.println("Enter the password");
      password=sc.next();
      
      if(username.equals("admin")){
          if(password.equals("admin")){
              System.out.println("loggedin sucessful!!!!");
          }else{
              System.out.println("password wrong");
          }
      }else{
          System.out.println("wrong user");
      }
      
      System.out.println(username+""+password);
    }
    
}
