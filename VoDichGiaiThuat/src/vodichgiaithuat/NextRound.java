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
public class NextRound {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int count=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        int temp = arr[k-1];
        for(int i=0;i<n;i++){
            if( arr[i]>= temp && arr[i]>0 ) count++;
        }
        System.out.println(count);
        }        
}
