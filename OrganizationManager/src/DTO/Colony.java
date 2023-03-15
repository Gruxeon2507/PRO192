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
public class Colony extends Organization {
    private String place;
    public Colony(){
        super(0);
        place="";
    }

    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }
    
    @Override
    public  void communicateByTool(){
        System.out.println("The colony comunicate by sound");
    }
    public void grow(){
        System.out.println("an annal cycle of growth that begins in spring");
    }
    public void reproduce(){
        System.out.println("Colony can reproduce itself throught a process");
    }    
    @Override
    public String toString(){
        return "the colony size is "+getSize()+" the colony place is "+ getPlace();
    }
}
