/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class ProblemG {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        int lenght=1;
        for(int i =0;i<n;i++){
            String input;
            input = sc.nextLine();
            input=input+"a";
            for(int j=0;j<n;j++){
                String temp=input.substring(j,j+lenght);
            }
        }
    }
}
