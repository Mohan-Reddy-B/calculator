/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;
import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author mohan
 */
public class jdbc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.next();
        System.out.println("Enter Email: ");
        String email = sc.next();
        System.out.println("Enter Password: ");
        String password = sc.next();
        System.out.println("Enter Address: ");
        String address = sc.next();
        
        //connecting jdbc to mysql
        try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/training1","root","");
         PreparedStatement st = cn.prepareStatement("insert into user(name,email,password,address)values(?,?,?,?)");
         st.setString(1, name);
         st.setString(2, email);
         st.setString(3,password);
         st.setString(4, address);
         
         int i = st.executeUpdate();
         if(i>0){
             System.out.println("Data Updated");
         }else{
             System.out.println("Data not Updated");
         }
         
         st.close();
         cn.close();
         
        }catch(Exception e){
         e.printStackTrace();
        }
    }
}
