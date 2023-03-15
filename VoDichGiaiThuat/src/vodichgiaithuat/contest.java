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
public class contest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int turn = 0;
            int temp = arr[i];
            if (arr[i] % 3 == 0) {
                turn = arr[i] / 3;

            } else if (arr[i] % 2 == 0) {
                turn = arr[i] / 2;
            } else if (arr[i] % 5 == 0) {
                turn = arr[i] / 5 * 2;
            }

            int turn1 = 0;
            if (arr[i] > 2) {
                turn1 += arr[i] / 3;
                arr[i] = arr[i] % 3;

            }
            if (arr[i] == 2) {
                turn1++;
            }
            if (arr[i] == 1) {
                turn1 += 2;
            }

            if (turn1 < turn || turn ==0) {
                turn = turn1;
            }
            System.out.println(turn);

        }
    }
}
