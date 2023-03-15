/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class JavaBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        int a=5,b=6,c=7,max;
//        int max=a>b?a:b;
//        max=max>c?max:c;
//        System.out.println("so lon nhat la: " + max);
        if (a>b)max=a;
        else max=b;
        if(max<c)max=c;
        System.out.println("Result: " + max);
}
}
