/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcodetalent2021;
import java.lang.*;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author Nguyen Hoang Minh
 */
public class ProblemG {
    public static void main(String[] args) {
        BigInteger c = new BigInteger("299792458");
        BigInteger time = new BigInteger("31557600");
        BigInteger conver = new BigInteger("1000");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BigInteger number = BigInteger.valueOf(num);
        number=number.multiply(c);
        number=number.multiply(time);
        number=number.divide(conver);
        System.out.println(number);
    }
}
