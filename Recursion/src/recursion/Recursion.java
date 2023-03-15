/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=;
        moveDisk(n,1,2,3);
    }
    public static int fractorial(int n){
        if(n==0) return 1;
        return n*fractorial(n-1);
    }
    public static int fibonannci(int n){
        if(n<2) return n;
        return fibonannci(n-1)+fibonannci(n-2);
        
    }
    public static int fibonnaci(int n,int fn1,int fn2){
        if(n<1) return fn2;
        System.out.println(fn2+" ");
        return fibonnaci(n-1,fn2,fn2+fn1);
    }
    public static void moveDisk(int n,int cot1,int cot2,int cot3){
        if(n==1) System.out.println("Move from "+cot1+" to "+cot2);
        else{
            moveDisk(n-1, cot1, cot3, cot2);
            moveDisk(1,cot1,cot2,cot3);
            moveDisk(n-1, cot3, cot2, cot1);
        }
    }
}
