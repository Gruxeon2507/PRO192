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
public class DominoPiling {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double m = sc.nextInt();
        double s=m*n;
        System.out.println((int)Math.floor(m*n/2));
        }
}
