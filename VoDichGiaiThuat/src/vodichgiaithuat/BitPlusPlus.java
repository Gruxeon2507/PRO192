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
public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();   
        int x=0;
        String[] array = new String[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextLine();
            if(array[i].charAt(1)=='+') x++;
            else x--;
        }
        System.out.println(x);
    }    
}
