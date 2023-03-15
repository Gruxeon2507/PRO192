/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de3;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class SinhVien extends Nguoi{
    private float Diem1,Diem2,DiemTB;

    public SinhVien(String name,float Diem1, float Diem2) {
        super(name);
        this.Diem1 = Diem1;
        this.Diem2 = Diem2;
    }
    public double getDTB(){
        if(getName().endsWith("[bB]")){
            return Math.ceil((Diem1+2*Diem2)/3);
        }
        else return Math.floor((Diem1+2*Diem2)/3);
    }
}
