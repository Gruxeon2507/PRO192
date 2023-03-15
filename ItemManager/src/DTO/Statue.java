/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class Statue extends Item{
    private int weight;
    private String color;
    public Statue(){
        weight=0;
        color="";
    }
    public Statue(int weight, String color){
        this.color = color;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
        public void inputStatue(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Input statue weight: ");
            weight=sc.nextInt();
            if (weight > 0) weight = weight;
            else throw new Exception();
        }
        catch (Exception e){
            System.out.println("Invalid input, please enter again: ");
            weight=sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Input statue color: ");
        color=sc.nextLine();
       
    }
    public void outputStatue(){
        System.out.println("Statue weight: "+weight);
        System.out.println("Statue color: "+color);
    }

}
