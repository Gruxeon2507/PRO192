/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vodichgiaithuat;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            sum+=arr[i];
            
        }
        int take=0,ntake=0;
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            sum=sum-arr[i];
            take=take+arr[i];
            ntake++;
            if(take>sum) break;
        }        
        System.out.println(ntake);
    }
}
