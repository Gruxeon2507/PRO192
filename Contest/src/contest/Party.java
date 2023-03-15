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
public class Party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[m][2];
            int[] unhappy = new int[k];
            int sum=0;
            for(int j=0;j<k;j++){
                unhappy[k]=sc.nextInt();
                sum+=unhappy[k];
            }
            for(int j=0;j<m;j++){
                arr[j][0]=sc.nextInt();
                arr[j][1]=sc.nextInt();
                if(arr[j][0]>arr[j][1]){
                   int temp = arr[j][0];
                   arr[j][0] = arr[j][1];
                   arr[j][1] = temp;
            }
            int cake=0;
            
        }
    }
}
}
