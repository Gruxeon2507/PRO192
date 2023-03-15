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
public class OptimalReduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int testcase = sc.nextInt();
            int[] array = new int[testcase];
            for (int j = 0; j < testcase; j++) {
                array[j] = sc.nextInt();
            }
            int max = array[0];
            for (int j = 1; j < testcase; j++) {
                if (array[j] > max) {
                    max = array[j];
                }
            }
            int count = 0, location = 0, check2, check3 = 0;
            for (int j = 0; j < testcase; j++) {
                if (array[j] == max && count == 0) {
                    count++;
                    location = j;
                    continue;
                }
                if (count != 0 && array[j] == max) {
                    check2 = j - location;
                    count++;
                    if (check2 != 1) {
                        check3++;
                    }
                   location = j;
                }


            }

            if (count == 1) {
                System.out.println("YES");
            } else if (check3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}

