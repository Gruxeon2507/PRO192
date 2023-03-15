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
public class cAPSlOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        int check=0;
        if(str.compareTo(str.toUpperCase())==0) str=str.toLowerCase();
        else if(str.length()==1) check =1;
        else if(str.matches("[a-z][A-Z]+")) check++;
        if(check==1)str=str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
        System.out.println(str);
    }
}
