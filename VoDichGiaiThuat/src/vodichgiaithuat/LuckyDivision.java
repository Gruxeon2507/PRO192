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
public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {4,7,44,47,74,77,444,447,474,477,744,747,774,777};
        boolean check = false;
        for(int i=0;i<arr.length;i++){
            if(n>arr[i]) continue;
            if(n%arr[i]==0){
                check = true;
                break;
            }
        }
        if(check == true) System.out.println("YES");
        else System.out.println("NO");
    }
}
