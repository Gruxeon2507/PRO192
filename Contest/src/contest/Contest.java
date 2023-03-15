/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.HashMap;
 
public class Contest {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextLong();
            }
            if (n == 1) {
                System.out.println("YES");
                continue;
            }
            int ans = 0;
            int temp=0;
            while(temp<n-1&&arr[temp]==arr[temp+1]){
                temp++;
            }
            if(temp==n){
                System.out.println("YES");
                return;
            }
            if(temp<n-1&&arr[temp+1]>=arr[temp]){
                ans++;
//                System.out.println("case 1");
            }
            temp=n-1;
            while(temp>0&&arr[temp]==arr[temp-1]){
                temp--;
            }
            if(temp==0){
                System.out.println("YES");
                return;
            }
            if(temp>0&&arr[temp]<=arr[temp-1]){
                ans++;
//                System.out.println("case 2");
            }
            for (int j = 0; j < n; j++) {
                if (j!=0&&arr[j] < arr[j - 1]) {
                    temp = j;
                    while (j+1<n&&arr[j] == arr[j + 1]) {
                        j++;
                        temp++;
                    }
                    if (j<n-1&&arr[j + 1] > arr[temp]) {
                        ans++;
//                        System.out.println("case 3");
                    }
                }
            }
//            System.out.println(ans);
            if (ans == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
 
    }
}

//38151981 36650624
//39653336
//36650624
