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
import java.util.Scanner;
public class errorcatching {
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        try{
            
        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }
        }
        catch (Exception e){
        System.out.println("ERRORRRRRRRR "+ e);
        }
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int c;
        if(y==0) throw new Exception(bug);
        else  c=x/y; 
        System.out.print(c);
    }
}
