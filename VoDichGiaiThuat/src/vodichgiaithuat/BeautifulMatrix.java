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
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array =new int [5][5];
        int m=0,n=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                array[i][j]=sc.nextInt();
                if (array[i][j]==1){
                    m=i;
                    n=j;
                }
            }
        }
        System.out.println(Math.abs(m-2)+Math.abs(n-2));
    }
}
