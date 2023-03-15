/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uglynumber;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class UglyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(UnglyNumberNo(n));
    }
    public static int UnglyNumberNo(int n){
        int ugly[]=new int[n];
        int i2=0,i3=0,i5=0;
        int next_multple_of_2=2;
        int next_multple_of_3=3;
        int next_multple_of_5=5;
        int next_ugly_no=1;
        ugly[0]=1;
        for(int i=1;i<n;i++){
            next_ugly_no=Math.min(next_multple_of_2, Math.min(next_multple_of_3, next_multple_of_5));
            ugly[i]=next_ugly_no;
            if(next_ugly_no==next_multple_of_2){
                i2=i2+1;
                next_multple_of_2=ugly[i2]*2;
            }
            if(next_ugly_no==next_multple_of_3){
                i3=i3+1;
                next_multple_of_3=ugly[i3]*3;                
            }
            if(next_ugly_no==next_multple_of_5){
                i5=i5+1;
                next_multple_of_5=ugly[i5]*5;
            }
        }
        return next_ugly_no;
    }
}
