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
public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n]; 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int p1=0;
        int p2=0;
        int p3=0;
        int p4=0;
        for(int i=0;i<n;i++){
            if (arr[i]==1) p1++;
            if (arr[i]==2) p2++;
            if (arr[i]==3) p3++;
            if (arr[i]==4) p4++;
        }
        int count=0;
        while (p4>0){
            count++;
            p4--;
        }
        while (p3>0&&p1>0){
            count++;
            p3--;
            p1--;
        }
        while (p3>0){
            count++;
            p3--;
        }
        while (p2>1){
            p2=p2-2;
            count++;
        }
        while (p1>0&&p2>0){
            if(p1>1) p1=p1-2;
            else p1--;
            p2--;
            count++;
        }
        while (p2>0){
            p2--;
            count++;
        }
        while (p1>0){
            if(p1>3) p1=p1-4;
            else if (p1>2) p1=p1-3;
            else if (p1>1) p1=p1-2;
            else if (p1>0) p1--;
            count++;
        }

        System.out.println(count);
    }
}

