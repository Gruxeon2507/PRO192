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
public class Item{
    private int value;
    private String creator;
    public Item(){
        this.value = 0;
        this.creator = "";
    }
    public Item(int value,String creator){
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void output(){
        System.out.println(value+"\t"+creator);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Input value: ");
            value=sc.nextInt();
            sc.nextLine();
            if(value <= 0) System.out.println("Invalid value, please enter again.");
        }while(value<=0);
        do{
            System.out.println("Input creator: ");
            creator=sc.nextLine();
            if(creator == null) System.out.println("Invalid creator, please enter again.");
        }while(creator == null);
    }
}    
