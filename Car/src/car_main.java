/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Hoang Minh
 */
import java.util.Scanner;

class Car {

    private String Color;
    private int EnginePower;
    private boolean Convertible;
    private boolean parkingBrake;

    public Car() {
        Color = "";
        EnginePower = 0;
        Convertible = false;
        parkingBrake = false;
    }

    public Car(String Color, int EnginePower, boolean Convertible, boolean parkingBreak) {
        this.Color = Color;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.parkingBrake = parkingBreak;
    }

    public String getColor() {
        return Color;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public void display() {
        System.out.println(Color + "\t" + EnginePower + "\t" + Convertible + "\t" + parkingBrake);
    }

}

public class car_main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of car: ");
        int n = sc.nextInt();
        System.out.println(n);
        Car[] obj = new Car[30];
        String Color;
        int EnginePower;
        boolean Convertible;
        boolean parkingBreak;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Input Color: ");
            Color = sc.nextLine();
            System.out.println(Color);
            System.out.println("Input Engine Power: ");
           
            EnginePower = sc.nextInt();
            System.out.println(EnginePower);
            System.out.println("Input Convertible: ");

            Convertible = sc.nextBoolean();
            System.out.println(Convertible);
            System.out.println("Input Parking Break: ");

            parkingBreak = sc.nextBoolean();
            System.out.println(parkingBreak);
            sc.nextLine();
            obj[i] = new Car();
            obj[i].setColor(Color);
            obj[i].setEnginePower(EnginePower);
            obj[i].setConvertible(Convertible);
            obj[i].setParkingBrake(parkingBreak);
        }
        System.out.println("Color \t EnginePower \t Convertible \t parkingBreak");
        for (int  i = 0; i < n; i++) {
            obj[i].display();
        }
        System.out.println("Finding Result: ");
        findbycolor(obj, "blue");
   
    }
 
    public static void findbycolor(Car[] obj,String color){
        for (Car var : obj){
            if(var.getColor().equalsIgnoreCase(color)) var.display();
        }
    }
}
