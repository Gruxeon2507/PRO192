/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Nguyen Hoang Minh
 */
import java.util.Scanner;
public class Vase extends Item {
    private int height;
    private String material;
    public Vase(){
        this.height = 0;
        this.material="";
    }
    public Vase(int height, String material){
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void inputVase(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Input vase height: ");
            height=sc.nextInt();
            if (height > 0) height = height;
            else throw new Exception();
        }
        catch (Exception e){
            System.out.println("Invalid input, please enter again: ");
            height=sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Input Vase Material: ");
        material=sc.nextLine();
       
    }
    public void outputVase(){
        System.out.println("Vase Height: "+height);
        System.out.println("Vase Materia: "+material);
    }
}
