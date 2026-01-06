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
public class jdbcdelete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to delete ");
        String n = sc.nextLine();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/training1","root","");
            PreparedStatement st = cn.prepareStatement("delete from user where name=?");
            st.setString(1,n);
            int i = st.executeUpdate();
            if(i>0){
                System.out.println(i+ " row is deleted:");
            }else{
                System.out.println(i+ " Row is not deleted");
            }
            st.close();
            cn.close();
        }catch(Exception e){
            
        }
    }
}
