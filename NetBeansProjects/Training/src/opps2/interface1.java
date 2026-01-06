/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opps2;

/**
 *
 * @author mohan
 */
public class interface1 {
    public static void main(String[ ] args){
       Carr c = new Carr("TATA" , 200);
       c.carinfo();
       c.breakk(34);
       c.speedup(34);
    }
}
interface Vehicle {
    void speedup(int speed);
    void breakk(int speed);
}

class Carr implements Vehicle {
    String name;
    int speed;

    public Carr(String name, int speed) {
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