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

class method1 {

    static Scanner sc = new Scanner(System.in);

    static void input(int[] a, int n) {

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void output(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("\t " + a[i]);
        }
        System.out.println("\n");
    }

    static int sum(int[] a, int n) {
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += a[i];
        }
        System.out.println(sum1);
        return sum1;
    }

    static int sum2(int[] a, int n) {
        int sum3 = 0;
        for (int i = 0; i < n; i++) {
            if(a[i]%2==0) sum3 += a[i];
        }
        System.out.println(sum3);
        return sum3;
    }


    
}
public class method{
        public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        method1.input(arr, n);
        method1.output(arr, n);
        method1.sum(arr, n);
        method1.sum2(arr, n);

    }  
}
