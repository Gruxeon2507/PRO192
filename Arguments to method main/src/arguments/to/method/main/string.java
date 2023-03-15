/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arguments.to.method.main;

/**
 *
 * @author Nguyen Hoang Minh
 */
    //viet chuong trinh nhap vao 1 mang cac ki tu sau do dem xem co bao nhieu ki tu la ki tu so
import java.util.Scanner;
public class string {
    public static void main(String[] args){
        int n,count=0;
        Scanner input= new Scanner(System.in);
        System.out.println("n= ");
        n= input.nextInt();
        char [] text=new char[n];
        input= new Scanner(System.in);
        for (int i=0;i<n;i++){
            text[i]=input.next().charAt(0);
            if (Character.isDigit(text[i])) count++;
        }
        System.out.println("result: "+ count);
    }
}
