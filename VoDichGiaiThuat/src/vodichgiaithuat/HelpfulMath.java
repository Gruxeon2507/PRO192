/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vodichgiaithuat;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class HelpfulMath {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String[] array = str.split("+");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i].compareTo(array[j])>0){
                    String temp =array[i];
                    array[i] = array[j];
                    array[j] =temp;
                }
            }
        }
    }
}
