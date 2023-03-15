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
public class HQ9Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        if(str.matches(".*[HQ9].*")) System.out.println("YES");
        else System.out.println("NO");
    }
}
