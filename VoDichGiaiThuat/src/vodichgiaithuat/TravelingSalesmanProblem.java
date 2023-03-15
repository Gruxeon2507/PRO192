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
public class TravelingSalesmanProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] move = new int[n];
        for (int i = 0; i < n; i++) {
            move[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            int testcase=sc.nextInt();
            int[][] location = new int[testcase][2];
            int maxX = 0;
            int maxY = 0;
            int minX = 0;
            int minY = 0;
            for (int j = 0; j < testcase; j++) {
                location[j][0] = sc.nextInt();
                if (location[j][0] > maxX) {
                    maxX = location[j][0];
                }
                if (location[j][0] < minX) {
                    minX = location[j][0];
                }
                location[j][1] = sc.nextInt();
                if (location[j][1] > maxY) {
                    maxY = location[j][1];
                }
                if (location[j][1] < minY) {
                    minY = location[j][1];
                }
            }
//            System.out.println(maxX+" " + maxY+" " +minX+" " +minY);
            move[i]= (maxX-minX+maxY-minY)*2;
        }
        for(int i=0;i<n;i++){
            System.out.println(move[i]);
        }
    }
}
