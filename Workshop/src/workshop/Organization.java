/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

/**
 *
 * @author Nguyen Hoang Minh
 */
public abstract class Organization {
    int size;
    public Organization(){
        
    }
    public Organization(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int Size){
        
    }
    public abstract void comunicateByTool();
    
    public String toString(){
        return getSize()+"\t";
    }
}
