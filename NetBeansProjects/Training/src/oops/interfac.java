/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author mohan
 */
public class interfac {
    public static void main(String[] args){
       Car c = new Car("Tata", 100);
        c.carinfo();
        c.speedup(50);
        c.breakk(100);
       
    }
    
}
interface Vehicle {
    void speedup(int speed);
    void breakk(int speed);
}

class Car implements Vehicle {
    String name;
    int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void speedup(int sp) {
        speed += sp;
        System.out.println("After speed up: " + speed);
    }

    @Override
    public void breakk(int sp) {
        speed -= sp;
        System.out.println("After break: " + speed);
    }

    public void carinfo() {
        System.out.println("Car name: " + name);
        System.out.println("Car speed: " + speed);
    }
}