/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vodichgiaithuat;

/**
 *
 * @author Nguyen Hoang Minh
 */
import java.util.Scanner;
public class idk {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc =new Scanner(System.in);
        while(sc.nextInt()>0){
            sum+=(Math.floor((double)sc.nextInt()/3)-2);
        }
    }
}
