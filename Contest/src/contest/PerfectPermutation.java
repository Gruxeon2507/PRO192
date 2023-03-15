/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class PerfectPermutation {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k;
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int[] arr = new int[arr1[i]];
            for (int j = 0; j < arr1[i]; j++) {

                arr[j] = j + 1;
            }
            for (int j = 0; j < arr1[i] - 1; j++) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            for (int j = 0; j < arr1[i]; j++) {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }

    }
}

