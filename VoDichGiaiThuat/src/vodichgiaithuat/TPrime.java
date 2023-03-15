/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vodichgiaithuat;

import java.util.Scanner;
public class TPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextDouble();
            array[i] = Math.sqrt(array[i]);
        }
        for (int i = 0; i < n; i++) {
            if ((array[i] - Math.floor(array[i])) != 0 || array[i]==1 ) {
                System.out.println("NO");
                continue;
            } else {
                int check = 0;
                for (double j = 2; j <= array[i] / 2; j++) {
                    if (array[i] % j == 0) {
                        check++;
                        System.out.println("NO");
                        break;

                    }
                }
                if (check == 0 ) System.out.println("YES");
            }
        }

    }

}
