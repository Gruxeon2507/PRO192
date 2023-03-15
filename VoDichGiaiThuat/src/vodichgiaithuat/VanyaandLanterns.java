/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vodichgiaithuat;

import java.util.Scanner;

public class VanyaandLanterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double l = sc.nextDouble();
        double[] x = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (x[i] < x[j]) {
                    double temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }

        double max = 0;
        for (int i = n - 1; i > 0; i--) {
            if (max < x[i] - x[i - 1]) {
                max = x[i] - x[i - 1];
            }
        }
        double check;
        if (x[0] > l - x[n - 1]) {
            check = x[0];
        } else {
            check = l - x[n - 1];
        }
        max = max / 2;
        if (max < check) {
            System.out.format("%.10f", check);
        } else {
            System.out.format("%.10f", max);
        }
    }
}
