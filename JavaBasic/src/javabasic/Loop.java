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

public class Loop {
    void getData(float []array,int n){

        Scanner input = new Scanner(System.in);

        float sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = input.nextFloat();
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("n= ");
        n = input.nextInt();
        float arr[] = new float[n];
        float sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextFloat();
        }
//        for(int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }
        int i = 0;

        while (i < n) {
            //tong cac phan tu co chi so chan
            sum += arr[i];
            i += 2;
        }
                
        i = 0;
        float sum2=0;
        while (i < n) {
            //tong cac phan tu chan
            if (arr[i] % 2 == 0) {
                sum2 += arr[i];
            }
            i++;

        }
        System.out.println("tong: " + sum);
        System.out.println("tong: " + sum2);
    }

    private static class array {

        public array() {
        }
    }
}
