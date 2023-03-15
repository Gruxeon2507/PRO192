/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Hoang Minh
 */
public class SpecCar extends Car {
    int type;
    public SpecCar(){
        super("",0);
        type=0;
    }
    SpecCar(String maker, int price, int type){
        super(maker, price);
        this.type=type;
    }
    @Override
    public String toString(){
        return maker+", "+price+", "+type;
    }
    public void setData(){
        maker="XZ"+maker;
        price=price+20;
    }
    public int getValue(){
        if(type<7) return price+10;
        else return price+15;
    }    
}
