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
import javabasic.method;
import java.util.Scanner;
public class test {

    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        n = sc.nextInt();
        int [] a = new int[n];
        method.input(a, n);
        method.output(a,n);
        method.sum(a, n);
        method.sum2(a, n);
    }
    
}
