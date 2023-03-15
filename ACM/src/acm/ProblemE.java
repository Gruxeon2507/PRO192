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
public class ProblemE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> fn =new ArrayList<>();
        fn.add((double)1);
        fn.add((double)1);
        int k=1;
        while(fn.get(k)<=100000){
            
            fn.add(fn.get(k)+fn.get(k-1));
            fn.add(fn.get(k));
            k++;
        }
        for(int i=fn.size()-100;i<fn.size();i++){
        
            System.out.println(i+" "+fn.get(i));
    }
    
        double p,q;

        p=sc.nextDouble();
        q=sc.nextDouble();
        int check=0;
        int ans=-1;
        for(int i=0;i<fn.size()-1;i++){
                if(fn.get(i)/fn.get(i+1) == p/q){
                    check++;
                    ans=i;
                    break;
            }
        }
        if(check==0) System.out.println("-1");
        else System.out.println(ans);
    }
}
