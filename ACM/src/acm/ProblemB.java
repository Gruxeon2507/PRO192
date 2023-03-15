/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class ProblemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s;
        int n,m;
        m=sc.nextInt();
        n=sc.nextInt();
        s=sc.nextLong();
        long a[] = new long[n];
        long b[] = new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            a[i]=a[i]%m;
            b[i]=sc.nextInt();
            b[i]=b[i]%m;
        }
        ArrayList<Long> result = new ArrayList<>();
        long count=0;
        while(s!=0){
            
            for(int i=0;i<n;i++){
                 s=(s*a[i]+b[i])%m;
                 result.add(s);
            }
           if(result.size()>n*n*n) break;
            
        }
        System.out.println(result.size());
    }
}
