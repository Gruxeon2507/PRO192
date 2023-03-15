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
public class Car {
    private String Color;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBreak;
    public Car(){
        Color="";
        EnginePower=0;
        Convertible=false;
        ParkingBreak=false;
    }
    public Car(String Color, int EnginePower, boolean Convertible, boolean ParkingBreak){
        this.Color = Color;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBreak = ParkingBreak;
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

    public boolean isParkingBreak() {
        return ParkingBreak;
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

    public void setParkingBreak(boolean ParkingBreak) {
        this.ParkingBreak = ParkingBreak;
    }
    
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    public void pressAcceleratorButtom(){
        System.out.println("You have pressed the Accelerator button");
    }
    public void output(){
        System.out.println(Color+"\t"+EnginePower+"\t"+Convertible+"\t"+ParkingBreak);
    }
}
