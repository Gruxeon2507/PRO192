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
public abstract class Organization {
    public int size;
    public Organization(){
        size=0;
    }
    public Organization(int size){
        this.size=size;
        
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public abstract void communicateByTool();
    public String toString(){
        return "The organization's size is: "+size;
    }
}
