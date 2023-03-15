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
public class PetyaandStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();
        if(str1.compareTo(str2)==0) System.out.println("0");
        else if(str1.compareToIgnoreCase(str2)>0) System.out.println("1");
        else System.out.println("-1");
    }
}
