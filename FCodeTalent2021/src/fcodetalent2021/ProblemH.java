/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcodetalent2021;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class ProblemH {
    public static void main(String[] args) {
        String integer = "[0-9]";
        String operator = "[-+*/]";
        String symbol = "[<>=]";
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String arr[] = input.split("[(|)]");
        int num1 = Integer.parseInt(arr[0].trim());
        String op1 = arr[1].trim();
        int num2 = Integer.parseInt(arr[2].trim());
        String ex = arr[3].trim();
        int num3 = Integer.parseInt(arr[4].trim());
        String op2 = arr[5].trim();
        int num4 = Integer.parseInt(arr[5].trim());
        
        
    }
    int calculate(int num1,int num2, String op){
        int result = 0;
        
    }
}

