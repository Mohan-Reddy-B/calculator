/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.sql.*;
import java.util.Scanner;
/**
 *
 * @author mohan
 */
public class jdbcupdate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to update");
        String name = sc.nextLine();
        System.out.println("Enter new password: ");
        String pass = sc.next();
        
        try{
         Class.forName("com.mysql.jdbc.Driver");//load the driver
        //connect to mysql
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/training1","root","");
        //create a statement to select the data
        PreparedStatement st = cn.prepareStatement("update user set password=? where name=?");
        st.setString(1, pass);
        st.setString(2,name);
        
        int i = st.executeUpdate();
        if(i>0){
            System.out.println(i+" Row updated");
        }else{
            System.out.println(i+" Row is not updated");
        }
        st.close();
        cn.close();
        
    }catch(Exception e){
            
            }
    }
}
