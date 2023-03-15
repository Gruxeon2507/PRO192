/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class NewClass1 {
        public static void main(String[] args) {
        String str1 = "toi muon ve nha an com roi ngu";
        String[] str2 = str1.split("[ ]");
        str1 = "";
                    String newstring= "";
            char c;
        for (int i = 0; i < str2.length; i++) {



            for (int j = (str2[i].length()-1) ; j >=0 ; j--) {
                c=str2[i].charAt(i);
                newstring=newstring+c;
            }
            str2[i]=newstring;
            newstring="";
            str1=str1+str2[i]+" ";
        }
        System.out.println(str1);
    }
}
