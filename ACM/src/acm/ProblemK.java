/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class ProblemK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n= sc.nextInt();
        int array[] =new int[n];
        for(int i=0;i<n;i++){
            array[i] =sc.nextInt();
        }
        boolean check[] =new boolean[n];
        for(int i=0;i<n;i++){
            check[i]=false;
            if(array[i]!=0) check[i]=true;
        }
        for(int i=0;i<n;i++){
            if(i>=n)array[i]==0){
                continue;
            }else if
            else{
                for(int j=i-array[i]+1;j<=i+array[i]-1;j++){
                    if(j<0||j>=n||j==i) continue;
                    else{
                             
                               System.out.println("");
                        if(check[j]==true && array[i]>=array[j]&&array[i]!=0){
                            i=j+1;
                            System.out.println(i);
                            
                        }check[j]=true;
                            
                    }
                }
            }
        }
        int flag=0;
        for(int i=0;i<n;i++){
            System.out.println(check[i]);
//            if(check[i]==false){
//                flag++;
//                break;
//            }
        }
        if(flag==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
