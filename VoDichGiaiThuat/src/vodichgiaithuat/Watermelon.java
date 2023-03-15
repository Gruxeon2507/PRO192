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
public class Watermelon {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if(w <= 2 || w%2==1)
            System.out.println("No");
        else{
           System.out.println("Yes");
    }
    
}
}
