/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;
import java.sql.*;
/**
 *
 * @author mohan
 */
//used read the data from mysql
//selecting data from mysql
public class jdbc1 {
    public static void main(String[] args){
        try{
        Class.forName("com.mysql.jdbc.Driver");//load the driver
        //connect to mysql
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/training1","root","");
        //create a statement to select the data
        PreparedStatement st = cn.prepareStatement("select * from user");
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            System.out.println("Name: "+rs.getString(1));
            System.out.println("Email: "+rs.getString(2));
            System.out.println("Password: "+rs.getString(3));
            System.out.println("Address: "+rs.getString(4));
            System.out.println("***************");
        }
        rs.close();
        st.close();
        cn.close();
        }catch(Exception e){
          e.getStackTrace();
        }
    }
}
