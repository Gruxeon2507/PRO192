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

/**
 *
 * @author Nguyen Hoang Minh
 */
public class ProblemI {

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        if (n < m) {
            System.out.println("Not Enough Data");
        } else {
            long data[] = new long[n];
            for (int i = 0; i < n; i++) {
                data[i] = sc.nextLong();
            }
            long average;
            for (int i = 0; i < n - m; i++) {
                long sum = 0;
                for (int j = 0; j < m; j++) {
                    sum += data[i + j];
                }
                average = sum / m;
                System.out.print(average + " ");
            }
        }

    }
}
