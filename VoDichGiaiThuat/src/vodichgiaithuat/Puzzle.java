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
public class Puzzle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr= new int[b];
        for(int i=0;i<b;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<b;i++){
            for(int j=0;j<b;j++){
                if(arr[i]<arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int min = arr[b-1] - arr[b-a];
        for(int i=b-2;i>=a-1;i--){
            if(min>arr[i]-arr[i+1-a]) min =arr[i]-arr[i+1-a];
        }
        System.out.println(min);
    }
}
