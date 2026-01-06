/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;
/**
 *
 * @author mohan
 */

public class basic1 {
    public static void main(String[] args){
      employees e = new employees("Mohan", 21, "Nrupathunga", 123, "ABC123CF", 300000);
      e.employeeinfo();
    }
}

class person{
    String name;
    int age;

    public person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void personinfo(){
        System.out.println("Name is :"+name);
        System.out.println("Age is : "+age);
    }
}

class student extends person{
    String college;
    int id;

    public student(String name , int age , String college , int id){
        super(name, age);
        this.college = college;
        this.id = id;
    }

    public void studentinfo(){
        super.personinfo();
        System.out.println("College name: "+college);
        System.out.println("ID: "+id);
    }
}

class employees extends student{
    String panno;
    int salary;

    public employees(String name , int age , String college , int id , String panno , int salary){
        super(name , age , college , id);
        this.panno = panno;
        this.salary = salary;
    }

    public void employeeinfo(){
        super.studentinfo();
        System.out.println("Pan Number is : "+panno);
        System.out.println("Salary is : "+salary);
    }
}
