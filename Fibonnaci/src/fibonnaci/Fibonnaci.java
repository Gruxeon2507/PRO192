/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonnaci;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class Fibonnaci {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0;i<=45;i++){
            System.out.print(fibonnaci(i)+" ");
        }
    }
    public static int fibonnaci(int n){
        if(n<=1) return n;
        else return fibonnaci(n-1)+fibonnaci(n-2);

    }
}
