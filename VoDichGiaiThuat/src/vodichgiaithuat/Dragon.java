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
public class Dragon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[][] array = new int[n][2];
        for(int i=0;i<n;i++){
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(array[i][0]<array[j][0]){
                    int temp = array[i][0];
                    array[i][0] = array[j][0];
                    array[j][0]=temp;
                    temp = array[i][1];
                    array[i][1] = array[j][1];
                    array[j][1]=temp;
                }
            }
        }
        int kill = 0;
        for(int i=0;i<n;i++){
            if(s>array[i][0]){
                kill++;
                s+=array[i][1];
            }
            else break;
        }
        if(kill == n) System.out.println("YES");
        else System.out.println("NO");
    }
}
