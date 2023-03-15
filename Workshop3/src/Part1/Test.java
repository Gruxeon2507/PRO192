/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class Test {
    
    public static void main(String[] args){
        Car c= new Car();
        c.pressAcceleratorButtom();
        c.pressStartButton();
        c.output();
        
        Car c2= new Car("Red", 100, true, true);
        c2.pressAcceleratorButtom();
        c2.setColor("Black");
        System.out.println("Color of c2: "+ c2.getColor());
        c2.output();
    }
}
