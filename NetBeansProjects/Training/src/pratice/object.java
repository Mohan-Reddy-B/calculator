/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

/**
 *
 * @author mohan
 */
public class object {
   public static void main(String[] args){
       student s = new student("mohan",21,"U24AN22S0228","NRUPATHUNGA");
       s.studentinfo();
        } 
}
class person{
    String name;    
    int age;
    public person(String n , int a){
        this.name = n;
        this.age = a;
    }
    public void personinfo(){
        System.out.println("NAME IS "+name);
        System.out.println("AGE IS "+age);
    }
}
class student extends person{
    String usnno;
    String college;
    public student(String n , int a , String u , String c){
        super(n,a);
        this.usnno=u;
        this.college=c;
    }
    public void studentinfo(){
        super.personinfo();
        System.out.println("USN NO:"+usnno);
        System.out.println("COLLEGE NAME:"+college);
    }
}