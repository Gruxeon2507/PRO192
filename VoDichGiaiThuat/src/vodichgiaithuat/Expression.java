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
public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=a+b+c;
        if(max< a*b*c) max=a*b*c;
        if(max< (a+b)*c) max=(a+b)*c;
        if(max<a*(b+c)) max=a*(b+c);
        System.out.println(max);
    }
}
