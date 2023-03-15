/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcodetalent2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProblemP {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s1 = sc.next();
        String s2 = sc.next();
        int size = s2.length();
        int count=0;
        for(int i=0;i<s1.length()-size+1;i++){
            if(s1.substring(i, i+size).equalsIgnoreCase(s2)){
                count++;
                i=i+size-1;
            }
        }
        if(count >=n) System.out.println("Y");
        else System.out.println("N");
    }
}

    