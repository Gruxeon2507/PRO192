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
public class FPTUniversity extends University implements Role{
    private String address;
    public FPTUniversity(){
        super(0,"");
        address="";       
    }

    public FPTUniversity( int size, String address, String name) {
        super(size, name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public int getSize() {
        return size;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString(){
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }
    public void createWorker(){
        System.out.println("providing human resources");
    }
    
}
