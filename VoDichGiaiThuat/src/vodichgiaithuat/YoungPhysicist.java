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
public class YoungPhysicist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][3];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
            array[i][2] = sc.nextInt();
        }
        int check=0;
        int sumx=0,sumy=0,sumz=0;
        for (int i=0;i<n;i++){
            sumx+=array[i][0];
            sumy+=array[i][1];
            sumz+=array[i][2];
        }
        if(sumx==0 && sumy==0 && sumz==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
