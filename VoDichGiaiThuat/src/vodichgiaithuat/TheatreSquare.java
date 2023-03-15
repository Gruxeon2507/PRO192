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
public class TheatreSquare {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt(); 
        double  m =sc.nextInt();
        double a=sc.nextInt();
        long result = (long)Math.ceil(m/a)*(long)Math.ceil(n/a);

        System.out.println(result);
}
}
