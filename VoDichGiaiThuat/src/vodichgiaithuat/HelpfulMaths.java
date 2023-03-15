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
public class HelpfulMaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[];
        arr = str.split("[+]");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        String result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = result +"+"+arr[i];
        }
        System.out.println(result);
    }
}
