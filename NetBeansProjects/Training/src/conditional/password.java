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
public class password {
  public static void main(String[] args){
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Username:");
      String username=sc.nextLine();
      System.out.println("Enter Password");
      String password=sc.nextLine();
      
      if (username.equals("admin")){
          if (password.equals("admin")){
              System.out.println("login Sucessful!!!!");
          }else{
              System.out.println("Wrong Password");
          }
          System.out.println(username+" "+password);
      }
  }  
}
