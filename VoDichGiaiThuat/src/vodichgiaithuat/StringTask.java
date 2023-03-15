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
public class StringTask {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String result = "";
        for(int i=0;i<str.length();i++){
            if(!str.substring(i,i+1).matches("[AOYEUIaoyeui]")){
                result+="."+str.substring(i,i+1);
            }

        }
                System.out.println(result.toLowerCase());
    }
}

